//48
public class func{
public void testEmptyPost(){
        URL url = new URL(ADDRESS);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoInput(true);
        int i = connection.getResponseCode();
        assertEquals(200, i);
        assertTrue(connection.getContentType().indexOf("xml") != -1);
}
}
