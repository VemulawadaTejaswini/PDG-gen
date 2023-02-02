//230
public class func{
	public void eventGoesToAppenders(){
    URL url = new URL(JETTY_FIXTURE.getUrl());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    String result = Util.readToString(connection.getInputStream());
    assertEquals("hello world", result);
}
}
