/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import modelo.Requerente;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

/**
 *
 * @author Gledson
 */
public class RequerenteDao implements Dao<Requerente, Serializable>{
    
    private static Session session;
    private Transaction transacao;

    @Override
    public void salvar(Requerente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Requerente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Requerente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Requerente carregarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Requerente> carregarTodos() {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Requerente.class);
        cr.addOrder(Order.asc("nome"));
        List<Requerente> requerentes = cr.list();
        session.close();
        return requerentes;
    }
    
}
