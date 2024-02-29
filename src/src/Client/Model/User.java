package Client.Model;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable { // Även användas i strömmar
    private String username;
    private ImageIcon image;
    private ArrayList<Message> UserMessages = new ArrayList<>();
    private ArrayList<User> contacts = new ArrayList<>();

    public User() {

    }

    public String getUserName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int hashCode() {
        return username.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof User)
            return username.equals(((User) obj).getUserName());
        return false;
    }
}

