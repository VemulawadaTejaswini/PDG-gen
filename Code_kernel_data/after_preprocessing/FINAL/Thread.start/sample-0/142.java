public class func{
public void postToFacebookWithAuthorize(final Activity activity,final Bundle params,final OnPostCompleteListener listener){
        new Thread(new Runnable() {
            public void run() {
                Log.d(TAG, "postToFacebookWithAuthorize()");
                Looper.prepare();
                mFacebook.authorize(activity, new String[] {"publish_stream", "offline_access"},
                        new FacebookPostListener(activity, params, listener));
                Looper.loop();
            }
        }).start();
}
}
