//250
public class func{
	public void onWipeFailed(final Exception ex){
                 new Thread(new Runnable() {
                   @Override
                   public void run() {
                     self.onWipeFailed(ex);
                   }}).start();
}
}
