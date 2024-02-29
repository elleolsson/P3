package Server.Model;

import Client.Model.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

public class Connection implements Runnable {
    @Override
    public void run() {

        Thread listenerThread = new Thread(() -> {
            try (Socket socket = new Socket();
                 ObjectInputStream input = new ObjectInputStream(socket.getInputStream())) {

                while (true) {
                    // Läs inkommande meddelande från servern
                    Message message = (Message) input.readObject();

                }
            } catch (Exception e) {
                System.err.println("Exception i MessageClient: " + e.getMessage());
                e.printStackTrace();
            }
        });
        listenerThread.start();

    }

}
