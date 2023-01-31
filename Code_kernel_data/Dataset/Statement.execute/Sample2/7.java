//6
public class func{
	public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_CLOB (ID INTEGER, DATA CLOB)");
}
}
