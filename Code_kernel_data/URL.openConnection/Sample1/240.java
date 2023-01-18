//239
public class func{
	public void getConnection(String url,String auth){
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("Authorization", auth);
}
}
