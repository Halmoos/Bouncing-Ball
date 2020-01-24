package tr.edu.sehir.oop;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {


    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("welcome client");
        System.out.println(args[0]);
        System.out.println(args[1]);
        float Y = Float.parseFloat(args[0]);
        float angle = Float.parseFloat(args[1]);
        Socket socket = new Socket("192.168.1.11", 4321);
        System.out.println("Client connected");
        new ClientThread(socket,Y,angle).start();

    }
}

