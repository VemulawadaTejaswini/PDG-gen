//307
public class func{
	public void testInstallCustomProtocolHandler(){
            URLConnection connection = new URL("http://android.com/").openConnection();
            assertTrue(connection instanceof Handler.HandlerURLConnection);
}
}
