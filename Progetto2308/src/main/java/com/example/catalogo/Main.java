package com.example.catalogo;

import com.example.catalogo.entity.Libro;
import com.example.catalogo.service.CatalogoService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogoPU");
        EntityManager em = emf.createEntityManager();
        CatalogoService catalogoService = new CatalogoService();

        em.getTransaction().begin();

        // Creazione e impostazione degli attributi di un libro
        Libro libro = new Libro();
        libro.setIsbn("1234567890123");
        libro.setTitolo("Java Programming");
        libro.setAnnoPubblicazione(2020);
        libro.setNumeroPagine(500);
        libro.setAutore("John Doe");
        libro.setGenere("Programming");

        catalogoService.aggiungiElemento(libro);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}


