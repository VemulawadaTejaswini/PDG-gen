//66
public class func{
	public void select(OracleConnection oracleConn){
        Statement stmt = oracleConn.createStatement();
        stmt.execute("SELECT 1 FROM DUAL");
        stmt.close();
}
}
