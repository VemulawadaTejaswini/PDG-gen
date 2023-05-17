//157
public class func{
public void testResourceAccessBodyNoToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_BODY);
        URLConnection c = url.openConnection();
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            testNoTokenResponse(httpURLConnection);
        }
}
}
