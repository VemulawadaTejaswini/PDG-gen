//188
public class func{
	public void actionPerformed(ActionEvent e){
        Thread runner = new Thread() {
          @Override
          public void run() {
            setVisible(false);

            doExport(false);
          }
        };
        runner.start();
}
}
