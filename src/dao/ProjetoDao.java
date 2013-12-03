/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import modelo.Projeto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Gledson
 */
public class ProjetoDao implements Dao<Projeto, Serializable> {

    private static Session session;
    private Transaction transacao;

    @Override
    public void salvar(Projeto obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        transacao = session.beginTransaction();
        session.save(obj);
        session.flush();
        transacao.commit();
        session.close();
    }

    @Override
    public void alterar(Projeto obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        transacao = session.beginTransaction();
        session.update(obj);
        session.flush();
        transacao.commit();
        session.close();
    }

    @Override
    public void excluir(Projeto obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        transacao = session.beginTransaction();
        session.delete(obj);
        session.flush();
        transacao.commit();
        session.close();
    }

    @Override
    public Projeto carregarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Projeto> carregarTodos() {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Projeto.class);
        List<Projeto> projetos = cr.list();
        session.close();
        return projetos;
    }
    
    public List<Projeto> carregarPorCodProjeto(String cod){
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Projeto.class);
        cr.add(Restrictions.ilike("codprojeto", cod, MatchMode.START));
        List<Projeto> projetos = cr.list();
        session.close();
        return projetos;
    }
    
}
