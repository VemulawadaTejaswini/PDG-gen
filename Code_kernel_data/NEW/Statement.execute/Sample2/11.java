//10
public class func{
	public void wrappedService(HttpServletRequest request,HttpServletResponse response,String[] path,java.util.LinkedHashMap<String,String> query){
        InitialContext jndiContext = new InitialContext();
        DataSource ds = (DataSource) jndiContext.lookup("java:comp/env/jdbc/connPool");
        Connection conn = ds.getConnection("root", "password");
        Statement stmt = conn.createStatement();
        boolean results = stmt.execute("SELECT NOW();");
        out.println("<br>results: " + results + "<br>");
}
}
