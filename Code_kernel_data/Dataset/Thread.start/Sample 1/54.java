//53
public class func{
	public void DelayedSearchQueue(long delay){
            Thread t = new Thread(new DelayedSearchQueueThread());
            t.setDaemon(true);
            t.setName(SEARCH_QUEUE_THREAD_NAME);
            t.start();
}
}
