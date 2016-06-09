/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoApp.service;

import it.java858.todoApp.entity.ToDo;
import javax.persistence.EntityManager;

/**
 *
 * @author tss
 */
public class ToDoService {

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
