//246
public class func{
	public void connect(){
        mTimer = new Timer(mReplyTimeout);
        new Thread(mTimer, "SmsDataChannel timer").start();
}
}
