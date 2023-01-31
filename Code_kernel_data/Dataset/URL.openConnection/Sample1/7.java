//6
public class func{
	public void main(String[] args){
      URL url = new URL("http://www.hccp.org/test/cookieTest.jsp");
      URLConnection conn = url.openConnection();
      conn.connect();
      cm.storeCookies(conn);
      cm.setCookies(url.openConnection());
}
}
