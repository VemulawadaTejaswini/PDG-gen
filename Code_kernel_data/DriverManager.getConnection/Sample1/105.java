//104
public class func{
	public void dropTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE T_PRE_STMT_TEST");
        stmt.close();
}
}
