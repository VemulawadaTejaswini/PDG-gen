//256
public class func{
	public void getInputStream(){
        URL url = new URL("http://developer.usa.gov/1usagov");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        return request.getInputStream();
}
}
