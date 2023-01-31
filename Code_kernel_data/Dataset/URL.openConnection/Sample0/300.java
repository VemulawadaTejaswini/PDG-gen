//299
public class func{
	public void Net(String urlStr,boolean useCache,Context ctxt){
        URL url = new URL(urlStr);
        mUrlConnection = (HttpURLConnection) url.openConnection();
        mUrlConnection.setRequestProperty("User-Agent", USERAGENT);
        mUrlConnection.setUseCaches(useCache);
}
}
