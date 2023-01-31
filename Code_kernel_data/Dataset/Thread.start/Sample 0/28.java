//27
public class func{
	public void beforeClass(){
      Thread t = new Thread() {
        public void run() {
          throw new RuntimeException("foobar");
        }
      };
      t.start();
      t.join();
}
}
