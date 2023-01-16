//41
public class func{
	public void initDialogAfterVisible(){
        final Thread thread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    connectHost();
                }
            });
        thread.start();
}
}
