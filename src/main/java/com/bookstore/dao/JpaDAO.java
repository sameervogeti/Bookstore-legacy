package com.bookstore.dao;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class JpaDAO<T> {
    protected EntityManager entityManager;

    public T create(T t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.flush();
        entityManager.refresh(t);
        entityManager.getTransaction().commit();
        return t;
    }
}
