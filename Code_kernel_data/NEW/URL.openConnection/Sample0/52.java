//51
public class func{
	public void callService(String endpoint,String signature){
        String query = rs.getCanonicalizedQueryString(attributes);
        URL url = new URL("https", endpoint, -1, "/?" + query);
        HttpURLConnection httpConnection = (HttpURLConnection) (url.openConnection());
        httpConnection.setRequestMethod(Constants.GET);
        httpConnection.setDoOutput(false);
        httpConnection.connect();
        return httpConnection.getInputStream();
}
}
