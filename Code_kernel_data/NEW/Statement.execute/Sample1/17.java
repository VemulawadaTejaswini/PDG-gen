//16
public class func{
	public void after(){
    Statement stmt = conn.createStatement();
    stmt.execute("DROP TABLE uuidtest");
    stmt.close();
}
}
