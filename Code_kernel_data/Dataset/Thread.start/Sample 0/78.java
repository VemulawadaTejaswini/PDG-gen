//77
public class func{
	public void actionPerformed(ActionEvent e){
    Thread runner = new Thread() {
      @Override
      public void run() {
        app.getGuiManager().openHelp(articleName);
      }
    };
    runner.start();
}
}
