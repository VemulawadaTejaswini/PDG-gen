public class func{
public void testUrlWithSpaceInHostViaHttpProxy(){
        URLConnection urlConnection = new URL("http:
                .openConnection(server.toProxyAddress());
            urlConnection.getInputStream();
}
}
