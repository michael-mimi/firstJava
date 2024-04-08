import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
        // File file = new File("src/solitude-dark-ambient-electronic-197737
        // (online-audio-converter.com).wav");
        // try {
        // audioStream = AudioSystem.getAudioInputStream(file);
        // clip = AudioSystem.getClip();
        // clip.open(audioStream);
        // while (!response.equals("Q")) {
        // System.out.println("P = play, S = Stop, R = reset, Q = quit");
        // System.out.print("Enter your choice:");

        // response = scanner.next();
        // response = response.toUpperCase();

        // switch (response) {
        // case "P":
        // clip.start();
        // break;

        // case "S":
        // clip.stop();
        // break;

        // case "R":
        // clip.setFramePosition(0);
        // break;

        // case "Q":
        // clip.close();
        // break;

        // default:
        // System.out.println("Not a valid response");

        // }
        // }
        // System.out.println("Byeeee!");

        // } catch (Exception e) {
        // System.err.println(e);
        // }

        // MyFrame frame = new MyFrame();

        // File file = new File("src/secret_message.txt");
        // if (file.exists()) {
        //     System.out.println("That file exists! :O!");
        //     System.out.println(file.getAbsolutePath());
        // } else {
        //     System.out.println("That file doesn't exist :(");
        // }
        // try {
        //     FileWriter writer = new FileWriter(file);
        //     writer.write("Now it's the new beginning!Horray!");
        //     writer.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(0,10));
        frame.setVisible(true);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.EAST);

    }

}