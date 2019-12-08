import javax.swing.SwingUtilities;

public class Main {

   private static final String TITLE = "Pomodoro Timer";

   public static void main(String [] args) {
      System.out.println("Standby...");
      SwingUtilities.invokeLater(new Runnable () {
         public void run() {
            new PomodoroFrame(TITLE);
         }
      });
   }
}