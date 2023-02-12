public class func{
public void onResume(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                update();
            }
        }).start();
}
}
