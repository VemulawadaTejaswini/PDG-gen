//234
public class func{
	public void makeRequest(){
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8092/").openConnection();
        connection.addRequestProperty("Connection", "keep-alive");
        InputStream in = connection.getInputStream();
        while (in.available() > 0) {
            in.read();
        }
        in.close();
}
}
