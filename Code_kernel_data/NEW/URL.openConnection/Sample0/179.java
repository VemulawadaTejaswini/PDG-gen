//178
public class func{
	public void getData(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        InputStream is = connection.getInputStream();
        while ((i = is.read()) != -1) {
            incomingMessage = incomingMessage + (char) i;
        }
        is.close();
}
}
