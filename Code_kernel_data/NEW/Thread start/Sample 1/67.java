//66
public class func{
	public void run(){
                    Thread timerThread = new Thread(threadGroup, TimerQueue.this,
                                                    "TimerQueue");
                    timerThread.setDaemon(true);
                    timerThread.setPriority(Thread.NORM_PRIORITY);
                    timerThread.start();
}
}
