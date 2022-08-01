//28
public class func{
	public void setUp(){
        conn = DriverManager.getConnection(url, "sa", "");
        stmt = conn.createStatement();
}
}
