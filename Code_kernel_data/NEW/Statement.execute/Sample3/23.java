//22
public class func{
	public void tearDownClass(){
        Connection conn = Connections.getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("drop table companies");
        stmt.close();
}
}
