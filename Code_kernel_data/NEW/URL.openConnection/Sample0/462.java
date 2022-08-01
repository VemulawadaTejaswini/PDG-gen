//461
public class func{
	public void HttpFileDownloadInputStream(URL url){
        if (!url.getProtocol().equals("http")) { 
            throw new MalformedURLException("URL is not a http URL"); 
        }
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(false);
        connection.setUseCaches(false);
        connection.setRequestMethod("GET"); 
        connection.connect();
        input = connection.getInputStream();
}
}
