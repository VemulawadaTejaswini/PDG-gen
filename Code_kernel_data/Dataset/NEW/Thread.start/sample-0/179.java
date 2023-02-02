//179
public class func{
public void onStart(final Intent intent,int startId){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    startServiceInBackgroundThread(intent);
                }
            }).start();
}
}
