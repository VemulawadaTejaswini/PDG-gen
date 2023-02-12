public class func{
public void operationFinished(Object ctx,final T resultOfOperation){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ConcurrencyUtils.put(q, Either.of(resultOfOperation, (Exception) null));
                }
            }).start();
}
}
