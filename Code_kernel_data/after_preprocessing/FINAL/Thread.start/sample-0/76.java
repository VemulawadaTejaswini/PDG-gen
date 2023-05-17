public class func{
public void actionPerformed(ActionEvent e){
        Thread runner = new Thread() {
          @Override
          public void run() {
            app.getGuiManager().openHelp("Construction_Protocol");
          }
        };
        runner.start();
}
}
