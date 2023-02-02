//220
public class func{
public void actionPerformed(ActionEvent e){
        Thread runner = new Thread() {
          @Override
          public void run() {
            app.setWaitCursor();
            app.createNewWindow();
            app.setDefaultCursor();
          }
        };
        runner.start();
}
}
