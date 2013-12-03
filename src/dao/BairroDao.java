/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import modelo.Bairro;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

/**
 *
 * @author Gledson
 */
public class BairroDao implements Dao<Bairro, Serializable>{
    
    private static Session session;
    private Transaction transacao;

    @Override
    public void salvar(Bairro obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Bairro obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Bairro obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bairro carregarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bairro> carregarTodos() {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Bairro.class);
        cr.addOrder(Order.asc("nome"));
        List<Bairro> bairros = cr.list();
        session.close();
        return bairros;
    }
    
}
