public class func{
public void testExecute_methodUnchanged(){
          (HttpURLConnection) new URL("http://www.google.com").openConnection();
      connection.setRequestMethod(method);
      NetHttpRequest request = new NetHttpRequest(connection);
      setContent(request, "text/html", "");
        request.execute().getContent().close();
      assertEquals(method, connection.getRequestMethod());
}
}
