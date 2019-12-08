import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {

   private static final String INITIAL_TIMER = "00:00";

   private JButton startButton = new JButton("Start");
   private JButton stopButton = new JButton("Stop");

   private JTextField maxField = new JTextField(5);
   private JLabel counterLabel = new JLabel(INITIAL_TIMER, JLabel.CENTER);

   

}