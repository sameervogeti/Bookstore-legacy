import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

public class UserDAOTest {

    @Test
    public void create() {
        Users users=new Users();
        users.setFullName("Test User");
        users.setEmail("Test@Test.com");
        users.setPassword("Test");

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        UserDAO userDAO=new UserDAO(entityManager);
        userDAO.create(users);
    }

    @Test
    public void update() {
    }

    @Test
    public void get() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void listAll() {
    }

    @Test
    public void count() {
    }
}