package dao;

import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;

@Log
public class UserDAOTest extends JPAHibernateTest {

    @Test
    public void create() {
        Users users=new Users();
        users.setFullName("Test User");
        users.setEmail("Test@Test.com");
        users.setPassword("Test");


        UserDAO userDAO = new UserDAO(em);
        Users users1 = userDAO.create(users);
        log.info("User Details saved are: " + users1.toString());
        Assert.assertTrue(users1 != null);

    }


}