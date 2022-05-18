package apptest.repository;

import apptest.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        UserRepository.userList = userList;
    }
}
