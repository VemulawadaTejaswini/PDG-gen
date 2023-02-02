//41
public class func{
public void testDeleteCustomer(){
        URL url = new URL(getURL() + "/" + 10);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        int response = connection.getResponseCode();
        connection.disconnect();
        assertEquals(204, response);
}
}
