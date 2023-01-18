//235
public class func{
	public void getResponse(URL contextUrl,String uri){
        URL url = new URL(contextUrl, uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            byte[] bytes = IOUtils.toBytes(connection.getInputStream(), true);
            return new String(bytes, "UTF-8");
            connection.disconnect();
}
}
