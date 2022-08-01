//227
public class func{
	public void operationFailed(Object ctx,final PubSubException exception){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    logger.error("Operation failed!", exception);
                    ConcurrencyUtils.put(queue, false);
                }
            }).start();
}
}
