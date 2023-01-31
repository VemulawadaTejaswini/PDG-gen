//405
public class func{
	public void createPostConnection(String url){
    conn = (HttpURLConnection) (new URL(url)).openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod(LumongoConstants.POST);
    conn.connect();
}
}
