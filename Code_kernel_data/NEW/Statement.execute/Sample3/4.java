//3
public class func{
	public void setUp(){
        Connection conn = DriverManager.getConnection(url, "sa", "");
          Statement stmt = conn.createStatement();
              stmt.execute("create table test (id int)");
              stmt.close();
}
}
