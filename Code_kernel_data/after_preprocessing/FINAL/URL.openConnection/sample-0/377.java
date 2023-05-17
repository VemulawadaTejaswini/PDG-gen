public class func{
public void testInjection(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setRequestProperty("Accept-Language", "fr-FR");
    conn.connect();
    assertEquals(200, conn.getResponseCode());
    String result = Tools.read(conn.getInputStream());
    assertTrue("Was expecting <" + result + "> to contain def", result.contains("def"));
}
}
