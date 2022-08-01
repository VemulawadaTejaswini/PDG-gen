//12
public class func{
	public void tearDown(){
        Statement stmt = _conn.createStatement();
        stmt.execute("DROP TABLE hold");
        stmt.close();
}
}
