//11
public class func{
	public void testSelect(){
    Statement stmt = _conn.createStatement();
    stmt.execute("select * from hold");
    stmt.close();
}
}
