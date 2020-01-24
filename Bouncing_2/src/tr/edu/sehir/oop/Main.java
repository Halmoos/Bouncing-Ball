package tr.edu.sehir.oop;

import javax.swing.JFrame;
import java.io.IOException;

/**
 * Main Program for running the bouncing ball as a standalone application.
 *
 * @author Hock-Chuan Chua
 * @version October 2010
 * modified by e gul
 */
public class Main {
    protected static BallWorld bw;
    public static void main(String[] args) throws IOException {


        // Run UI in the Event Dispatcher Thread (EDT), instead of Main thread
        //javax.swing.SwingUtilities.invokeLater(new Runnable() {
        //   public void run() {
        JFrame frame = new JFrame("A World of Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(bw = new BallWorld(640, 480)); // BallWorld is a JPanel
        frame.pack();            // Preferred size of BallWorld
        frame.setVisible(true);  // Show it
        new Server().runServer();
        //}
        //});
    }
}
