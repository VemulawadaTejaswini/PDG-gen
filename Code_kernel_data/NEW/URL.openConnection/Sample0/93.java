//92
public class func{
	public void put(String uri){
        URL u = new URL(uri);
        HttpURLConnection uc = (HttpURLConnection)u.openConnection();
        uc.setRequestMethod("PUT");
        int status = uc.getResponseCode();
}
}
