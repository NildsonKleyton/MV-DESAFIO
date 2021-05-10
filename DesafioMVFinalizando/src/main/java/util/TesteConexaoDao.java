package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import antlr.collections.List;
import dao.GeralDao;
import dao.GeralDaoImpl;
import entidade.CafeManha;
import entidade.Colaborador;

public class TesteConexaoDao {

	public static void main(String[] args) {

		GeralDao dao = new GeralDaoImpl();
		Colaborador cb = new Colaborador();
		CafeManha cf =new CafeManha();
		CafeManha cf1 =new CafeManha();
		
//		cb.setCpf("11111111122");
//		cb.setNome("teste1");
//		
//		cf.setItemCafe("Suco goiaba");
//		cf.setColaborador(cb);
//		
//		cf1.setItemCafe("pão queijo");
//		cf1.setColaborador(cb);
//		
//		dao.inserir(cb);
//		dao.inserir(cf);
//		dao.inserir(cf1);
		
		
		dao.consulta(cb);
		
	}

}
