//97
public class func{
	public void dropTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("DROP PROCEDURE BASIC_CALL_0");
        stmt.close();
}
}
