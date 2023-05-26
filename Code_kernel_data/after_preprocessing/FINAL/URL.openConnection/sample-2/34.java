public class func{
public void service(HttpServletRequest req,HttpServletResponse resp){
            URL resource = getServletContext().getResource(path);
            URLConnection conn = resource.openConnection();
            resp.setContentType(conn.getContentType());
            StreamUtil.io(conn.getInputStream(), resp.getOutputStream(), true, false);
}
}
