package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.GeralDao;
import dao.GeralDaoImpl;
import entidade.CafeManha;
import entidade.Colaborador;

@ManagedBean(name = "colaboradorBean")
@RequestScoped
public class ColaboradoeBean {

	private Colaborador colaborador;
	private CafeManha cafe;
	private GeralDaoImpl geralDao;
	private List<Object> listarColaborador;
	
	public ColaboradoeBean() {
		this.colaborador =new Colaborador();
		this.cafe= new CafeManha();
		this.listarColaborador = new ArrayList<Object>();
	}
	
	//metodos
	public void adicionar() {
		this.geralDao.inserir(colaborador);
	}

	public void pesquisar() {
		this.listarColaborador = geralDao.consulta(this.colaborador);
	}

	public void editar() {
		this.geralDao.atualizar(this.colaborador);
	}

	public void remover() {
		this.geralDao.remover(this.colaborador, getColaborador());
	}
	//get set

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public CafeManha getCafe() {
		return cafe;
	}

	public void setCafe(CafeManha cafe) {
		this.cafe = cafe;
	}

	public GeralDaoImpl getGeralDao() {
		return geralDao;
	}

	public void setGeralDao(GeralDaoImpl geralDao) {
		this.geralDao = geralDao;
	}

	public List<Object> getListarColaborador() {
		return listarColaborador;
	}

	public void setListarColaborador(List<Object> listarColaborador) {
		this.listarColaborador = listarColaborador;
	}



		
}
