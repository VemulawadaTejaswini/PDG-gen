//333
public class func{
	public void operationFailed(Object ctx,PubSubException exception){
            new Thread(new Runnable() {
                public void run() {
                    ConcurrencyUtils.put(queue, false);
                }
            }).start();
}
}
