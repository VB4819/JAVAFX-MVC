package controller;

import model.User;
import util.CrudOperations;

public class UserController {
    private CrudOperations crudOperations;

    public UserController() {
        crudOperations = new CrudOperations();
    }

    public boolean loginUser(String username, String password) {
        User user = crudOperations.readUser(username);
        if (user != null && user.getPassword().equals(password)) {
            return true; 
        }
        return false; 
    }

    public boolean registerUser(String username, String password, String userRole) {
        User newUser = new User(username, password, userRole);
        return crudOperations.createUser(newUser);
    }
}