public class func{
public void testHttpsCookie(){
    URL base = new URL("https://" + NetUtils.getHostPortString(server
            .getConnectorAddress(1)));
    HttpsURLConnection conn = (HttpsURLConnection) new URL(base,
            "/echo").openConnection();
}
}
