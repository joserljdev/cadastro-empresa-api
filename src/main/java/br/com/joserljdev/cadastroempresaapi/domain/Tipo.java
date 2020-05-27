package br.com.joserljdev.cadastroempresaapi.domain;

public enum Tipo {
	MATRIZ("Matriz"), FILIAL("Filial");

	private String descricao;

	private Tipo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}