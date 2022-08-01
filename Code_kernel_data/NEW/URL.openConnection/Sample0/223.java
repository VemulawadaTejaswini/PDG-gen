//222
public class func{
	public void getOriginatingIp(){
    URL url = new URL("http://checkip.amazonaws.com/");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.connect();
    return IOUtils.toString(connection.getInputStream()).trim() + "/32";
}
}
