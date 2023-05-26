public class func{
public void init(Context context){
        new Thread(new Runnable() {
            public void run() {
                fill();
            }
        }).start();
}
}
