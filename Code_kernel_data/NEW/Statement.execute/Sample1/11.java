//10
public class func{
	public void after(){
    Statement stmt = _conn.createStatement();
    stmt.execute("DROP TABLE genkeys");
    stmt.close();
}
}
