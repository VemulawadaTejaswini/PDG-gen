//334
public class func{
public void operationFinished(Object ctx,Void result){
            new Thread(new Runnable() {
                public void run() {
                    ConcurrencyUtils.put(queue, true);
                }
            }).start();
}
}
