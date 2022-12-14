package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Eugene", "Petrov", (byte) 21);
        userService.saveUser("Trofim", "D'yakov", (byte) 22);
        userService.saveUser("Konstantin", "Piminov", (byte) 21);
        userService.saveUser("Viktoria", "Nikonova", (byte) 21);
        userService.removeUserById(2);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
