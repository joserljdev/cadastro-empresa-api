package br.com.joserljdev.cadastroempresaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.cadastroempresaapi.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}