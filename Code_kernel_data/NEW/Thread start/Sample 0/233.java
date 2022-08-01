//232
public class func{
	public void run(){
        new Thread(new Runnable() {
          public void run() {
            new QuietNetworkContext().downloadToFileQuietly(getUrl(), tipsFile);
            myDownloadInProgress = false;
          }
        }).start();
}
}
