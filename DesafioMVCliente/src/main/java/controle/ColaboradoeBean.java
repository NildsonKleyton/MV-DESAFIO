package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entidade.CafeManha;
import entidade.Colaborador;

@ManagedBean(name = "ColaboradoeBean")
@RequestScoped
public class ColaboradoeBean {

	private Colaborador colaboracor;
	private CafeManha cafe;
	
	public Colaborador getColaboracor() {
		return colaboracor;
	}
	public void setColaboracor(Colaborador colaboracor) {
		this.colaboracor = colaboracor;
	}
	public CafeManha getCafe() {
		return cafe;
	}
	public void setCafe(CafeManha cafe) {
		this.cafe = cafe;
	}
	
	
}
