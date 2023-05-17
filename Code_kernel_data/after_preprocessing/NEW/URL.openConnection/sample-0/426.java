//426
public class func{
public void test(URL initialURL){
    HttpURLConnection conn = (HttpURLConnection)initialURL.openConnection();
    conn.addRequestProperty("Accept-Language", "fr-FR");
    assertEquals(200, conn.getResponseCode());
    assertEquals(Locale.FRANCE, locale);
}
}
