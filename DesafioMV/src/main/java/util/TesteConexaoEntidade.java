package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import endidade.CafeManha;
import endidade.Colaborador;
public class TesteConexaoEntidade {

	public static void main(String[] args) {
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction t = ent.getTransaction();
		t.begin();

		Colaborador cb = new Colaborador();
		CafeManha cf =new CafeManha();
		CafeManha cf1 =new CafeManha();
		
		cb.setCpf("98765432100");
		cb.setNome("teste");
		ent.persist(cb);
		
//		cf.setId(1);
		cf.setItemCafe("Café");
		cf.setColaborador(cb);
		ent.persist(cf);
		
//		cf1.setId(2);
		cf1.setItemCafe("Pão");
		cf1.setColaborador(cb);
		ent.persist(cf);
		
		t.commit();
		ent.close();

	}

}
