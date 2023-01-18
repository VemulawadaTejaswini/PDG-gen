//235
public class func{
	public void getHttpConnection(String target){
        URL url = new URL(target);        
        URLConnection connection = url.openConnection();            
        assertTrue(connection instanceof HttpURLConnection);
        return (HttpURLConnection)connection;        
}
}
