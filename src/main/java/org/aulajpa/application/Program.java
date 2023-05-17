package org.aulajpa.application;

import org.aulajpa.domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin(); // precisa começar a transação
        em.persist(new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"));
        em.persist(new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com"));
        em.persist(new Pessoa(null, "Ana Maria", "ana@gmail.com"));
        em.getTransaction().commit(); // confirmar transação
    }
}
