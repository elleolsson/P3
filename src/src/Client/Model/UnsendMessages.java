package Client.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class UnsendMessages {
    private HashMap<User, ArrayList<Message>> unsend = new HashMap<>();

    public UnsendMessages() {

    }

    public synchronized void put(User user, Message message) {
    // hämta ArrayList – om null skapa en och placera i unsend
    // lägga till Message i ArrayList
    }

    public synchronized ArrayList<Message> get(User user) {
     return;
    }
    // fler synchronized-metoder som behövs
}