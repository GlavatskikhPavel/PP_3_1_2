package ru.glavatskikh.PP_3_1_2.dao;

import ru.glavatskikh.PP_3_1_2.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User showUserById(int id);
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(int id, User user);
}
