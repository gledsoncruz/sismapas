/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import modelo.Autor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

/**
 *
 * @author Gledson
 */
public class AutorDao implements Dao<Autor, Serializable>{

    private static Session session;
    private Transaction transacao;
    
    
    @Override
    public void salvar(Autor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Autor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Autor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Autor carregarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Autor> carregarTodos() {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Autor.class);
        cr.addOrder(Order.asc("nome"));
        List<Autor> autores = cr.list();
        session.close();
        return autores;
    }
    
}
