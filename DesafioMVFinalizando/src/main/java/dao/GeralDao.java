package dao;

import java.util.List;

import entidade.Colaborador;
/**
 * 
 * @author Nildson Kleyton
 *
 */
public interface GeralDao {

	public void inserir(Object obj);
	public void atualizar(Object obj);
	public Object remover(Object obj, Object chavePrimaria);
	public List<Object> consultar(Object obj);
//	public List<Colaborador> consultar(Colaborador colab);
	public Object objExiste(Object obj);
	
}
