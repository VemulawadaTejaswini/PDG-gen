//115
public class func{
	public void doCall(){
        URL url = new URL(formatCallURL());
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        InputStream is = connection.getInputStream();
}
}
