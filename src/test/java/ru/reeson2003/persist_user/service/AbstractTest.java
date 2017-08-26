package ru.reeson2003.persist_user.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.reeson2003.persist_user.api.service.UserService;

import java.util.Date;

/**
 * Date: 26.08.2017.
 * Time: 18:12.
 *
 * @author Pavel Gavrilov.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:test-context.xml")
public abstract class AbstractTest extends Assert {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractTest.class);

    public static final String USER_FIRST_NAME = "Ivan";
    public static final long ID = 101L;
    public static final String MIDDLE_NAME = "Ivanovich";
    public static final String LAST_NAME = "Ivanov";
    public static final Date BIRTH_DATE = new Date(2000, 01, 01);
    public static final String EMAIL = "ivanonov@mail.ru";
    public static final String LOGIN = "ivanov.i.i";
    public static final String PASSWORD = "12345678";
    public static final Date REGISTER_DATE = new Date(2010, 10, 10);
    public static final Date UPDATE_DATE = new Date(2015, 10, 20);
    public static final  boolean LOGGED_IN = false;

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void serviceNotNullTest() {
        LOGGER.info("Starting serviceNotNullTest");
        assertNotNull("UserService is null", userService);
    }
}
