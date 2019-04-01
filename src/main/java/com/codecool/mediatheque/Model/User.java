package com.codecool.mediatheque.Model;

import java.util.LinkedList;
import java.util.List;

public class User {

    private final int id;
    private String username;
    private List<Integer> rentedItems = new LinkedList<>();
    private UserRole role;

    public User(int id, String username, UserRole role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public void rentItem(int itemId) {
    }

    public void returnItem(int itemId) {
    }

}
