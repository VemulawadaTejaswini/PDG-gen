//143
public class func{
	public void connectToFacebook(final Activity activity){
        new Thread(new Runnable() {
            public void run() {
                Log.d(TAG, "connectToFacebook()");
                Looper.prepare();
                mFacebook.authorize(activity, new String[] {"publish_stream", "offline_access"},
                        new FacebookConnectListener(activity));
                Looper.loop();
            }
        }).start();
}
}
