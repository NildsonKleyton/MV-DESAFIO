package dao;

import java.util.List;

import endidade.Colaborador;
/**
 * 
 * @author Nildson Kleyton
 *
 */
public interface GeralDao {

	public void inserir(Object obj);
	public void atualizar(Object obj);
	public Object remover(Object obj, Object chavePrimaria);
	public List<Object> consulta(Object obj);
	public Object objExiste(Object obj);
	
}
