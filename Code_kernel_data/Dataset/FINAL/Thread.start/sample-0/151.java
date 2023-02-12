public class func{
public void runExit(){
        new Thread(new Runnable() {
            public void run() {
                if(animator!=null)
                    animator.stop();
                drawable.destroy();
            }
        }).start();
}
}
