//159
public class func{
	public void run(){
            new Thread(new Runnable() {
              public void run() {
                garbageCollect();
              }
            }).start();
}
}
