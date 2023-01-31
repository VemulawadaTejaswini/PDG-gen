//230
public class func{
	public void testThreadStart(){
        SignallingRunnable runner = new SignallingRunnable("testThreadStart");
        Thread thread = new Thread(runner, "tThreadStartTest");
        thread.start();
}
}
