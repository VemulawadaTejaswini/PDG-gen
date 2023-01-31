//72
public class func{
	public void get(String urlString){
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection(java.net.Proxy.NO_PROXY);
        return new String(Streams.readFully(urlConnection.getInputStream()));
}
}
