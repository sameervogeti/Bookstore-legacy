package com.bookstore.dao;

import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
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
