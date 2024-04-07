import java.awt.Color;
import java.io.File;
import java.util.*;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // System.out.println(0b100);//4
        // System.out.println(0100);//64
        // System.out.println(100);//100
        // System.out.println(0x100);//256
        // int a = 100;
        // double b = Math.sqrt(a);
        // System.out.println("value of b is "+b);

        // AudioInputStream audioStream;
        // Clip clip;
        // Scanner scanner = new Scanner(System.in);
        // String response = "";
        // File file = new File("src/solitude-dark-ambient-electronic-197737 (online-audio-converter.com).wav");
        // try {
        //     audioStream = AudioSystem.getAudioInputStream(file);
        //     clip = AudioSystem.getClip();
        //     clip.open(audioStream);
        //     while (!response.equals("Q")) {
        //         System.out.println("P = play, S = Stop, R = reset, Q = quit");
        //         System.out.print("Enter your choice:");

        //         response = scanner.next();
        //         response = response.toUpperCase();

        //         switch (response) {
        //             case "P":
        //                 clip.start();
        //                 break;

        //             case "S":
        //                 clip.stop();
        //                 break;

        //             case "R":
        //                 clip.setFramePosition(0);
        //                 break;

        //             case "Q":
        //                 clip.close();
        //                 break;

        //             default:
        //                 System.out.println("Not a valid response");
                        
        //         }
        //     }
        //     System.out.println("Byeeee!");

        // } catch (Exception e) {
        //     System.err.println(e);
        // }

        MyFrame frame = new MyFrame();
        
    }

}