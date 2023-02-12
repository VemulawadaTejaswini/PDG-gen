public class func{
public void operationFailed(Object ctx,final PubSubException exception){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ConcurrencyUtils.put(q, Either.of((T) null, (Exception) exception));
                }
            }).start();
}
}
