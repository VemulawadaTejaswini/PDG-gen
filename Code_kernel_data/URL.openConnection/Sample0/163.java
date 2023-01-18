//162
public class func{
	public void makePreSignedRequest(String method,String preSignedUrl,Map headers){
            URL url = new URL(preSignedUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            addHeaders(connection, headers);
}
}
