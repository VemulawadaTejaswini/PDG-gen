//55
public class func{
public void request(final String aPostcode){
    final URL requestURL = new URL(BASEURL.concat(aPostcode.trim().replace(" ", "%20")));
    final URLConnection conn = requestURL.openConnection();
    conn.connect();
    final InputStream is = conn.getInputStream();
}
}
