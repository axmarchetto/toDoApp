/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoApp.service;

import it.java858.todoApp.entity.Categoria;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author tss
 */
public class CategoriaService {

    public CategoriaService() {
    }

    //metodo per salvare l'informazione
    // si mette static perchè è un metodo a disposizione che non si istanzia con l'oggetto
    public static Categoria save(Categoria c) {
        EntityManager em = DbService.getEm();
        em.getTransaction().begin();
        //faccio un merge, se è nuovo crea il record e mi ritorna quello che ha messo 
        // se invece ha l'id allora fa l'update e ritorna quello che ha  messo
        // non è detto che serva ma di regola si fa la restituzione di quello inserito 

        Categoria saved = em.merge(c);
        em.getTransaction().commit();
        return saved;
    }

    public static List<Categoria> findAll() {
        EntityManager em = DbService.getEm();
        //faccio una lista di categorie   
        List<Categoria> listcat;
        //non si usa * in questo caso ma il nome della tabella
        //IN QUESTO MODO CREO LA QUERY, LA ESEGUO E PASSO IL RISULTATO 
        System.out.println("fino a qua arrivo");
        listcat = em.createQuery("select c from Categoria c order by c.nome", Categoria.class).getResultList();

        return listcat;
    }

    public static void elimina(Categoria c) {
        EntityManager em = DbService.getEm();
        em.getTransaction().begin();

        em.remove(c);
        em.getTransaction().commit();

    }

}
