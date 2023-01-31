//455
public class func{
	public void performPostRequest(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            PrintWriter out = new PrintWriter(connection.getOutputStream());
                out.println("foo=bar");
                out.close();
}
}
