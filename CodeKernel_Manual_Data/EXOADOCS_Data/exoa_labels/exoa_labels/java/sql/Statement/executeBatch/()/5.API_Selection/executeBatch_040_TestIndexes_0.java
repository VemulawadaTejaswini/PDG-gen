public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtnumber1		number(10)"+")");
		user1Stmt.executeBatch();
		
		
		
		user1Stmt.executeUpdate("CREATE UNIQUE INDEX "+INDEX_PREFIX+"_0 ON "+	TABLE_PREFIX+"_0(dtnumber1)");

		user1Stmt.close();
	}
}