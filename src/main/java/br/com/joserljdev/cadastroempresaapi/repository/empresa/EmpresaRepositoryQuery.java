package br.com.joserljdev.cadastroempresaapi.repository.empresa;

import java.util.List;

import br.com.joserljdev.cadastroempresaapi.domain.Empresa;
import br.com.joserljdev.cadastroempresaapi.repository.filter.EmpresaFilter;

public interface EmpresaRepositoryQuery {
	public List<Empresa> filtrar(EmpresaFilter empresaFilter);
}
