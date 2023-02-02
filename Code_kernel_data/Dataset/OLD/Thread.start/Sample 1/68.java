//67
public class func{
	public void launch(){
    myRunnable = new MyRunnable(getCaretBlinkingRateTimeMillis());
    Thread t = new Thread(myRunnable, "caret blinker daemon");
    t.setDaemon(true);
    t.setPriority(3);
    t.start();
}
}
