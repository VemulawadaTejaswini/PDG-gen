//105
public class func{
	public void runAndAssert(StreamListener mockListener,StreamDispatcher dispatcher,int tweetEvents,int deleteEvents,int limitEvents,int warningEvents){
    new Thread(dispatcher).start();
}
}
