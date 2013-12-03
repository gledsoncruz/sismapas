/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Gledson
 */
public interface Dao<T, ID extends Serializable> {
    
    public void salvar(T obj);

    public void alterar(T obj);

    public void excluir(T obj);

    public T carregarPorId(Integer id);

    public List<T> carregarTodos();
    
}
