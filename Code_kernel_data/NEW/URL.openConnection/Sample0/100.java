//99
public class func{
	public void postSeamReload(){
        String loopbackURL = Framework.getProperty("nuxeo.loopback.url");
        URL location = new URL(loopbackURL + "/restAPI/seamReload");
        HttpURLConnection uc = (HttpURLConnection) location.openConnection();
        uc.setRequestMethod("POST");
        return uc.getResponseCode() == HttpURLConnection.HTTP_OK;
}
}
