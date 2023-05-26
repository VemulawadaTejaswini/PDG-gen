public class func{
public void checkThatWeHaveLocalGeoServer(){
        URL url = new URL( getCapabilities );
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();
            if( responseCode == 200 ){
                localGeoserver = true;
            }
}
}
