//29
public class func{
	public void select(com.mysql.jdbc.Connection oracleConn){
        Statement stmt = oracleConn.createStatement();
        stmt.execute("SELECT 'x'");
        stmt.close();
}
}
