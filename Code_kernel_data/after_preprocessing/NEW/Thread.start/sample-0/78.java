//78
public class func{
public void actionPerformed(ActionEvent e){
        Thread runner = new Thread() {
          @Override
          public void run() {
            ((GuiManagerD) app.getGuiManager())
                .openHelp("Function_Inspector_Tool");
          }
        };
        runner.start();
}
}
