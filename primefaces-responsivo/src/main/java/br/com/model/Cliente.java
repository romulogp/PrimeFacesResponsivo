package br.com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cpf;
	private String nome;
	private String telefone;
	private String celular;
	private String email;
	private String estado;
	private Date dataNascimento;
	private boolean parcelamentoLiberado;
	private String observacao;
	private List<Endereco> enderecos = new ArrayList<>();

	public Cliente() {
	}
	
	public Cliente(String cpf, String nome, String telefone, String celular, String email, String estado,
			Date dataNascimento, boolean parcelamentoLiberado, String observacao, List<Endereco> enderecos) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.estado = estado;
		this.dataNascimento = dataNascimento;
		this.parcelamentoLiberado = parcelamentoLiberado;
		this.observacao = observacao;
		this.enderecos = enderecos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isParcelamentoLiberado() {
		return parcelamentoLiberado;
	}

	public void setParcelamentoLiberado(boolean parcelamentoLiberado) {
		this.parcelamentoLiberado = parcelamentoLiberado;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}
