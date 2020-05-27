package br.com.joserljdev.cadastroempresaapi.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "*CNPJ é obrigatório")
	@Size(max = 18, message = "O CNPJ deve conter 14")
	private String cnpj;

	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@NotEmpty(message = "* Nome é obrigatório")
	@Size(max = 40, message = "O nome deve conter no máximo 40 caracteres")
	private String nome;

	@NotEmpty(message = "* Razão Social é obrigatória")
	@Size(max = 40, message = "A razão social deve conter no máximo 40 caracteres")
	private String razaoSocial;

	@NotEmpty(message = "* Contato é obrigatório")
	@Size(max = 40, message = "O contato deve conter no máximo 40 caracteres")
	private String contato;

	@NotEmpty(message = "* E-mail é obrigatório")
	@Size(max = 40, message = "O e-mail deve conter no máximo 40 caracteres")
	private String email;

	@NotEmpty(message = "*CEP é obrigatório")
	@Size(max = 9, message = "O CEP deve conter 8")
	private String cep;

	@NotEmpty(message = "* Estado é obrigatório")
	@Size(max = 40, message = "O estado deve conter no máximo 40 caracteres")
	private String estado;

	@NotEmpty(message = "* Bairro é obrigatório")
	@Size(max = 40, message = "O bairro deve conter no máximo 40 caracteres")
	private String bairro;

	@NotEmpty(message = "* Cidade é obrigatória")
	@Size(max = 40, message = "A cidade deve conter no máximo 40 caracteres")
	private String cidade;

	@NotEmpty(message = "* Logradouro é obrigatório")
	@Size(max = 40, message = "O logradouro deve conter no máximo 40 caracteres")
	private String logradouro;

	@Size(max = 40, message = "O complemento deve conter no máximo 40 caracteres")
	private String complemento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}