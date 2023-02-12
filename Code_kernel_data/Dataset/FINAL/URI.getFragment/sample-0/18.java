public class func{
public void testAsynch(){
         URI uri = new URI(request.getUri());
         String query = (uri.getQuery() == null ? "" : "&") + "wait=1000";
         URI newURI = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment());
         request = new ClientRequest(newURI.toString());
         response = request.get();
         Assert.assertEquals(HttpServletResponse.SC_OK, response.getStatus());
         Assert.assertEquals(response.getEntity(String.class), "content");
         response = request.get();
         Assert.assertEquals(HttpServletResponse.SC_OK, response.getStatus());
         Assert.assertEquals(response.getEntity(String.class), "content");
         request = new ClientRequest(jobUrl);
         response = request.delete();
         Assert.assertEquals(HttpServletResponse.SC_NO_CONTENT, response.getStatus());
         response = request.get();
         Assert.assertEquals(HttpServletResponse.SC_GONE, response.getStatus());
         response.releaseConnection();
}
}
