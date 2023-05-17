public class func{
public void testCallIndexPage(){
    URL url = new URL(this.baseUrl);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestProperty("Authorization", "bearer 74eccf5f-0995-4e1c-b08c-d05dd5a0f89b");
    connection.connect();
    assertEquals(200, connection.getResponseCode());
    String output = IOUtils.toString(connection.getInputStream());
    assertTrue(output.contains("emma.blunt"));
}
}
