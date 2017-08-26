package ru.reeson2003.persist_user.impl.service;

import org.springframework.stereotype.Service;
import ru.reeson2003.persist_user.api.UserPersistException;
import ru.reeson2003.persist_user.api.domain.User;
import ru.reeson2003.persist_user.api.service.UserQuery;
import ru.reeson2003.persist_user.api.service.UserService;

import java.util.List;

/**
 * Date: 26.08.2017.
 * Time: 18:08.
 *
 * @author Pavel Gavrilov.
 */
@Service
public class UserServiceImpl implements UserService {
    public void addUser(User user) throws UserPersistException {

    }

    public User getUser(long l) throws UserPersistException {
        return null;
    }

    public void updateUser(User user) throws UserPersistException {

    }

    public void deleteUser(long id) throws UserPersistException {

    }

    public User findByLogin(String s) throws UserPersistException {
        return null;
    }

    public List<User> getUsers() throws UserPersistException {
        return null;
    }

    public UserQuery createUserQery() {
        return null;
    }
}
