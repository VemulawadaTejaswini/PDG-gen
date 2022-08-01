//153
public class func{
	public void get(String request,IOUtils.LineRead callback,int timeout){
        URL url = new URL(request);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
}
}
