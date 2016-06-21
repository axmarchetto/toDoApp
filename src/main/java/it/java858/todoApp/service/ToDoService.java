/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoApp.service;

import it.java858.todoApp.entity.Categoria;
import it.java858.todoApp.entity.ToDo;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author tss
 */
public class ToDoService {

    public static List<ToDo> findAll() {
        EntityManager em = DbService.getEm();
        //faccio una lista di categorie   
        List<ToDo> dafare;
        //non si usa * in questo caso ma il nome della tabella
        //IN QUESTO MODO CREO LA QUERY, LA ESEGUO E PASSO IL RISULTATO 
        System.out.println("fino a qua arrivo");
        dafare = em.createQuery("select t from ToDo t order by t.testo desc", ToDo.class).getResultList();

        return dafare;
    }

    private ToDoService() {
    
    
    }
    
    //salvare un nuovo todo 
    public static ToDo save (ToDo tosave){
        EntityManager em = DbService.getEm();
        em.getTransaction().begin();
        //salvo oggetto e ritorno quello che ho salvato 
        ToDo saved = em.merge(tosave);
        em.getTransaction().commit();
        return saved;
    }
    
}
