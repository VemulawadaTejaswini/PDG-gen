//266
public class func{
	public void serializeResource(String resourceURL){
    URL url = new URL(resourceURL);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.addRequestProperty("Cache-Control", "max-age=0");
    mediaContainer = serializer.read(MediaContainer.class,
        con.getInputStream(), false);
}
}
