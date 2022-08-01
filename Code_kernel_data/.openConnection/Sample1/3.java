//2
public class func{
	public void getUnAuthServletAnswer(URL url,String method){
        if (url.getPath().endsWith("/")) {
            pingUrl = new URL(url.toString() + servletMethod);
        } else {
            pingUrl = new URL(url.toString() + "/" + servletMethod);
        }
        URLConnection conn = pingUrl.openConnection();
        String answer = Utils.readFullyAndClose(conn.getInputStream());
        return new ServletAnswer(answer);
}
}
