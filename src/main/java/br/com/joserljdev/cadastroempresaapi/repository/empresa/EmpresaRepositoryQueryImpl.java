package br.com.joserljdev.cadastroempresaapi.repository.empresa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import br.com.joserljdev.cadastroempresaapi.domain.Empresa;
import br.com.joserljdev.cadastroempresaapi.repository.filter.EmpresaFilter;

public class EmpresaRepositoryQueryImpl implements EmpresaRepositoryQuery {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Empresa> filtrar(EmpresaFilter empresaFilter) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Empresa> criteria = builder.createQuery(Empresa.class);
		Root<Empresa> root = criteria.from(Empresa.class);
		
		Predicate[] predicates = criarRestricoes(empresaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Empresa> query = em.createQuery(criteria);
		return query.getResultList();
	}

	private Predicate[] criarRestricoes(EmpresaFilter empresaFilter, CriteriaBuilder builder, Root<Empresa> root) {
		List<Predicate> predicates = new ArrayList<>();
				
		if(!StringUtils.isEmpty(empresaFilter.getNome())) {
			predicates.add(builder.like(builder.lower(
					root.get("nome")), "%" + empresaFilter.getNome().toLowerCase() + "%"));
		}
		
		if(!StringUtils.isEmpty(empresaFilter.getCnpj())) {
			predicates.add(builder.equal(root.get("cnpj"), empresaFilter.getCnpj()));
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
}