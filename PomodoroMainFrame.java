import javax.swing.UIManager;

public class PomodoroMainFrame implements Runnable {
   private PomodoroManager mgr;
   public static final int mgrfps = 20;
   public static final int fps = 20;

   public PomodoroMainFrame() {
      mgr = new PomodoroManager();
   }

   static {
      try {
         javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch(Exception e) {

      }
   }

   public static void main(String[] args)
   {
      PomodoroMainFrame mainFrame = new PomodoroMainFrame();
      mainFrame.run();
   }

   @Override
   public void run()
   {
      ThreadGroup threadGroup = new ThreadGroup("Pomodoro main group");
      Thread thread = new Thread(thread, mgr);
      threat.start();
      try{
         thread.join();
      } catch (InterruptedException e) {
         thread.interrupt();
      }
   }
}