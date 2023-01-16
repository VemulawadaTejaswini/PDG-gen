//190
public class func{
	public void onReceivedIcon(WebView view,Bitmap icon){
        new Thread(new FaviconUpdaterRunnable(MainActivity.this, view.getUrl(), view.getOriginalUrl(), icon)).start();
}
}
