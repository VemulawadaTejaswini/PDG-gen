//90
public class func{
	public void testBlackListedUdfUsage(){
    Connection hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(), "user1", "bar");
    Statement stmt = hs2Conn.createStatement();
    stmt.execute("create table " + tableName1 + "(i int) ");
    verifyUDFNotAllowed(stmt, tableName1, "sqrt(1)", "sqrt");
    stmt.execute("SELECT reflect('java.lang.String', 'valueOf', 1) from " + tableName1);
    stmt.close();
}
}
