//251
public class func{
	public void onWipeSucceeded(){
                 new Thread(new Runnable() {
                   @Override
                   public void run() {
                     self.onWipeSucceeded();
                   }}).start();
}
}
