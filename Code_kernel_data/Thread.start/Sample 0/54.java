//53
public class func{
	public void evaluate(){
      Runnable callSystemExit = new Runnable() {
        public void run() {
          System.exit(ARBITRARY_EXIT_STATUS);
        }
      };
      Thread thread = new Thread(callSystemExit);
      thread.start();
}
}
