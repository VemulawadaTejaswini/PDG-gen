//125
public class func{
	public void testGetThatBookInterfacePrototype(){
        URL url = new URL("http://localhost:" + PORT + "/test/5/bookstorestorage/thosebooks/123");
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("SpringProxy", "true");
        InputStream in = connect.getInputStream();           
}
}
