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
		
		cb.setCpf("12345678903");
		cb.setNome("teste3");
		
		cf.setItemCafe("Suco abacaxi");
		cf.setColaborador(cb);
		
		cf1.setItemCafe("queijo");
		cf1.setColaborador(cb);
		
		dao.inserir(cb);
		dao.inserir(cf);
		dao.inserir(cf1);
		
	}

}
