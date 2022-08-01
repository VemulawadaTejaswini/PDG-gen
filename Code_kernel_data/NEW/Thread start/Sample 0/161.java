//160
public class func{
	public void showInAnotherThread(final String approveButtonText){
            new Thread(new Runnable() {
                public void run() {
                    results[0] = fileChooser.showDialog(frame, approveButtonText);
                    latch.countDown();
                }
            }).start();
}
}
