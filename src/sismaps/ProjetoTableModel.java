/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sismaps;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Projeto;

/**
 *
 * @author Gledson
 */
public class ProjetoTableModel extends AbstractTableModel {

    private List<Projeto> projetos;

    public ProjetoTableModel(List<Projeto> projetos) {

        super();
        this.projetos = projetos;

    }

    @Override
    public int getRowCount() {

        return projetos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int objeto, int atributo) {

        Projeto proj = (Projeto) projetos.get(objeto);

        if (atributo == 0) {
            return proj.getCodprojeto();
        } else if (atributo == 1) {
            return proj.getRequerente().getNome();
        } else if (atributo == 2) {
            return proj.getAutor().getNome();
        } else if (atributo == 3) {
            return proj.getBairro().getNome();
        } else {
            return proj.getCaminho();
        }

    }

    @Override
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Cod";
        } else if (coluna == 1) {
            return "Requerente";
        } else if (coluna == 2) {
            return "Autor";
        } else if (coluna == 3) {
            return "Localização";
        } else {
            return "Caminho";
        }
    }
}
