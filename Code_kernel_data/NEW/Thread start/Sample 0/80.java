//79
public class func{
	public void delayCommitsWithInterrupt(){
        Thread t = new Thread(commit);
        t.start();
        t.interrupt();
}
}
