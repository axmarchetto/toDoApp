/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoApp.gui;

import it.java858.todoApp.entity.Categoria;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tss
 */
public class CategoriaTM extends AbstractTableModel {

    //nomi dei campi della tabella
    String[] nomi = {"id", "nome"};
    // creiamo un list di tipo categoria
    List<Categoria> categoria;

    public CategoriaTM(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    //serve per fare refresh dei dati
    /**
     * faccio un refresh delle categrie
     *
     * @param data
     */
    public void changeData(List<Categoria> data) {
        categoria = data;
        //invoca evento per segnalare che i dati sono cambiati 
        fireTableDataChanged();

    }

    @Override
    public int getRowCount() {
        return categoria.size();

    }

    @Override
    public int getColumnCount() {

        return nomi.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return categoria.get(rowIndex).getId();
            case 1:
                return categoria.get(rowIndex).getNome();
            default: return null;
          
        }
    }

    //nomi colonne
    
    public String getColumnName(int column){
        return nomi[column];
    }
    
    public Categoria get(int row) {

        return categoria.get(row);
    }
}
