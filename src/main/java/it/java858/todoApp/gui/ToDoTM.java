/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoApp.gui;

import it.java858.todoApp.entity.Categoria;
import it.java858.todoApp.entity.ToDo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tss
 */
public class ToDoTM extends AbstractTableModel {

    //nomi dei campi della tabella
    String[] nomi = {"id", "testo", "Data", "Categoria"};
    // creiamo un list di tipo categoria per contenere i dati 
    List<ToDo> todos = new ArrayList<>();

    public ToDoTM(List<ToDo> todo) {
        this.todos = todo;
    }

    private String formatData(Date d) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return df.format(d);
    }

    //serve per fare refresh dei dati

    /**
     * faccio un refresh delle categrie
     *
     * @param data
     */
    public void changeData(List<ToDo> data) {
        this.todos = data;
        //invoca evento per segnalare che i dati sono cambiati 
        this.fireTableDataChanged();

    }

    @Override
    public int getRowCount() {
        return todos.size();

    }

    @Override
    public int getColumnCount() {

        return nomi.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return todos.get(rowIndex).getId();
            case 1:
                return todos.get(rowIndex).getTesto();
            case 2:
                return formatData(todos.get(rowIndex).getDataCreazione());
            case 3:
                return todos.get(rowIndex).getCategorie().toString();
            default:
                return null;

        }
    }

    //nomi colonne
    @Override
    public String getColumnName(int column) {
        return nomi[column];
    }

    public ToDo get(int row) {
        return todos.get(row);
    }
}
