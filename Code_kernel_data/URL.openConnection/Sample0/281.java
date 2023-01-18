//280
public class func{
	public void getInputStream(){
        URL url = new URL("http://stream.meetup.com/2/rsvps");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        return request.getInputStream();
}
}
