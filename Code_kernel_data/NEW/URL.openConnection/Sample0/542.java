//541
public class func{
	public void createConnection(URI uri){
    URL url = uri.toURL();
    URLConnection connection = url.openConnection();
    if (!(connection instanceof HttpURLConnection)) {
      throw new HttpTransportException("URI [" + uri + "] is not an HTTP URL");
    }
    else {
      HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
      prepareConnection(httpURLConnection);
      return new HttpUrlConnection(httpURLConnection);
    }
}
}
