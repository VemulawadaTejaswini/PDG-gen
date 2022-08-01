//82
public class func{
	public void getData(String urlString){
    URL url = new URL(urlString);
    URLConnection connection = url.openConnection();
    return IOUtils.toByteArray(connection.getInputStream());
}
}
