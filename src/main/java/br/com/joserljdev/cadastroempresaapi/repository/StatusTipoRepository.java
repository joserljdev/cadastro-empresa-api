package br.com.joserljdev.cadastroempresaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.cadastroempresaapi.domain.Tipo;

public interface StatusTipoRepository extends JpaRepository<Tipo, Integer> {

}
