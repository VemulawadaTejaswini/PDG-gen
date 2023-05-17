public class func{
public void testGetCollectionOfObjects(){
        URL url = new URL(getURL() + "/" + "findCustomerByCity" + "/"
                + "Ottawa");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        InputStream xml = connection.getInputStream();
}
}
