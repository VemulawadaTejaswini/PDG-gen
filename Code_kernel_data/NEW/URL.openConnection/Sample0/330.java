//329
public class func{
	public void ObaDefaultConnection(Uri uri){
            Log.d(TAG, uri.toString());
        URL url = new URL(uri.toString());
        mConnection = (HttpURLConnection) url.openConnection();
        mConnection.setReadTimeout(30 * 1000);
}
}
