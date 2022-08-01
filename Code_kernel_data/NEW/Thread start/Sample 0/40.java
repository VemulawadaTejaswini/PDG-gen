//39
public class func{
	public void initDialogAfterVisible(){
        final Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                connectHosts();
            }
        });
        t.start();
}
}
