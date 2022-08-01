//418
public class func{
	public void sendRequest(String method,URL url,String cookie,boolean followRedirects){
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setInstanceFollowRedirects(followRedirects);
}
}
