package ru.reeson2003.persist_user.service;

import org.junit.Assert;
import org.junit.Test;
import ru.reeson2003.persist_user.api.service.UserService;
import ru.reeson2003.persist_user.impl.service.UserServiceImpl;

/**
 * Date: 27.08.2017.
 * Time: 23:48.
 *
 * @author Pavel Gavrilov.
 */
public class ServiceFactoryMethodTest extends Assert{
    @Test
    public void test() {
        UserService service = UserServiceImpl.getService();
        assertNotNull("Service is NULL", service);
    }
}
