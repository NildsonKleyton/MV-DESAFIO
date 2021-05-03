package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.GeralDao;
import dao.GeralDaoImpl;
import endidade.CafeManha;
import endidade.Colaborador;

public class TesteConexaoDao {

	public static void main(String[] args) {

		GeralDao dao = new GeralDaoImpl();
		Colaborador cb = new Colaborador();
		CafeManha cf =new CafeManha();
		CafeManha cf1 =new CafeManha();
		
		cb.setCpf("12345678901");
		cb.setNome("teste");
		
		cf.setId(1);
		cf.setItemCafe("Café");
		cf.setColaborador(cb);
		
		cf1.setId(2);
		cf1.setItemCafe("Pão");
		cf1.setColaborador(cb);
		
		dao.inserir(cb);
		dao.inserir(cf);
		dao.inserir(cf1);
	}

}
