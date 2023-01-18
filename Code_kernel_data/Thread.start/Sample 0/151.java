//150
public class func{
	public void quit(){
    final Thread t = new Thread() {
      public void run() {
        locationProvider.setLocationListener(null, 0, 0, 0);
      }
    };
    t.start();
}
}
