//213
public class func{
	public void lostTopic(final ByteString topic){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ConcurrencyUtils.put(bsQueue, Pair.of(topic, false));
                }
            }).start();
}
}
