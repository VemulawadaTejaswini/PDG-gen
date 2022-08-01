//50
public class func{
	public void doPost(HttpServletRequest req,HttpServletResponse rsp){
    String query = req.getQueryString();
    if (query != null) {
      if (query.equals("sendHappyHtml")) {
        rsp.getWriter().write("<html><body><div id=':)'></div></body></html>");
        return;
      }
    }
    BufferedReader reader = req.getReader();
    reader.read(buf, 0, req.getContentLength());
}
}
