//303
public class func{
	public void logoutAsync(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                do_logout();
            }
        }).start();
}
}
