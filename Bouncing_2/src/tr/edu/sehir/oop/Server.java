package tr.edu.sehir.oop;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int port = 4321;
    private ServerSocket ss = null;
    SendBall ball;

    public void runServer() throws IOException {
        ss = new ServerSocket(port);
        System.out.println("Server is ready to accept connections");
        while (true) {
            Socket socket = ss.accept();
            new ServerThread(socket).start();
        }
    }
}