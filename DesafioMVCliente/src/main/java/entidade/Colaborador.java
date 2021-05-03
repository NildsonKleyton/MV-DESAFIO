package entidade;

import java.util.List;

public class Colaborador {
	private String cpf;
	private String nome;

	private List<CafeManha> listaCafe;

	@Override
	public boolean equals(Object obj) {
		Colaborador colaboradorEntrada = (Colaborador) obj;

		if (this.cpf.equalsIgnoreCase(colaboradorEntrada.getCpf())) {
			return true;
		} else {
			return false;
		}
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

	public List<CafeManha> getListaCafe() {
		return listaCafe;
	}

	public void setListaCafe(List<CafeManha> listaCafe) {
		this.listaCafe = listaCafe;
	}

}
