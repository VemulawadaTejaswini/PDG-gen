public class func{
public void startGetPrimarySipPhoneThread(){
        new Thread(new Runnable() {
            public void run() {
                getPrimarySipPhone();
            }
        }).start();
}
}
