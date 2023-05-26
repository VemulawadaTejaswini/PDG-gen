public class func{
public void doTestForbiddenMethods(int port,String method){
    URL url = new URL("http:
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod(method);
    Assert.assertEquals(HttpServletResponse.SC_FORBIDDEN,
      conn.getResponseCode());
}
}
