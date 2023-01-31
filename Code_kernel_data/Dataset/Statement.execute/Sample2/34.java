//33
public class func{
	public void testInsertRollback(){
        Connection conn = getConnection();
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();
        stmt.execute(CREATE_TABLE);
}
}
