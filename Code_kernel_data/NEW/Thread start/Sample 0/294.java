//293
public class func{
	public void thread(final String name){
    Thread later = new Thread() {
      public void run() {
        method(name);
      }
    };
    later.start();
}
}
