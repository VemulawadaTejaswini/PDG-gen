//102
public class func{
	public void testUrlWithSpaceInHostViaHttpProxy(){
        URLConnection urlConnection = new URL("http://and roid.com/")
                .openConnection(server.toProxyAddress());
            urlConnection.getInputStream();
}
}
