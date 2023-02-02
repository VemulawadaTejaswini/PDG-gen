//20
public class func{
public void startDownload(){
    if (mRunnable != null) {
      mRunnable.abort();
    }
    mRunnable = new DownloadRunnable(this);
    new Thread(mRunnable).start();
}
}
