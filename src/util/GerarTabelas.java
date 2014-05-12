/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import modelo.Alocacao;
import modelo.Autor;
import modelo.Bairro;
import modelo.Projeto;
import modelo.Requerente;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author gledson.cruz
 */
public class GerarTabelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnnotationConfiguration cfg = new AnnotationConfiguration(); //deprecated
        cfg.configure("hibernate.cfg.xml");
    //Configuration cfg = new Configuration();
    //Entidades do modelo sendo adicionadas na configuração
    cfg.addAnnotatedClass(Alocacao.class);
    cfg.addAnnotatedClass(Autor.class);
    cfg.addAnnotatedClass(Bairro.class);
    cfg.addAnnotatedClass(Projeto.class);
    cfg.addAnnotatedClass(Requerente.class);
        
    SchemaExport schemaExport = new SchemaExport(cfg);
    schemaExport.create(true, true);
    }
    
}
