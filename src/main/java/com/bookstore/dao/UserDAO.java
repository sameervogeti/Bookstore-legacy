package com.bookstore.dao;

import com.bookstore.entity.Users;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users> {


    public UserDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public Users create(Users users) {
        return super.create(users);
    }

    @Override
    public Users update(Users entity) {
        return null;
    }

    @Override
    public Users get(Object id) {
        return null;
    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Users> listAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }
}
