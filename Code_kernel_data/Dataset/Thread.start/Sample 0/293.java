//292
public class func{
	public void init(final Context context){
        new Thread(new Runnable() {
            public void run() {
                cacheAllThreads(context);
            }
        }).start();
}
}
