/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858;

import com.sun.xml.internal.bind.v2.TODO;
import it.java858.todoApp.entity.ToDo;
import it.java858.todoApp.gui.Main;
import it.java858.todoApp.service.DbService;
import it.java858.todoApp.service.ToDoService;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
//        System.out.println("Start jpa");
//        //crea l'entity manager factory
////        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
////        EntityManager em = emf.createEntityManager();
//        //apre la connessione e attiva oggetto per lavorare con le entities
//
//        EntityManager em = DbService.getEm();
//
//        System.out.println("jpa ok");
//
//        ToDo td = new ToDo();
//        td.setTesto("pausa caffè");
//        td.setDataCreazione(new Date());
//
////        em.getTransaction().begin();
////        em.persist(td);
////        em.getTransaction().commit();
////        em.close();
//        
//        ToDoService.save(td);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
