package tr.edu.sehir.oop;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientThread extends Thread {
    Socket socket;
    float YtoSend;
    float sendAngle;
    ClientThread(Socket socket,float YtoSend,float sendAngle){
        this.socket = socket;
        this.YtoSend = YtoSend;
        this.sendAngle = sendAngle;
    }
    public void run(){
        try {
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Ok");
            SendBall ball = new SendBall();
            ball.y = YtoSend;
            ball.moveAngle = sendAngle;
            os.writeObject(ball);
            System.out.println("message sent to the server ...");
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
