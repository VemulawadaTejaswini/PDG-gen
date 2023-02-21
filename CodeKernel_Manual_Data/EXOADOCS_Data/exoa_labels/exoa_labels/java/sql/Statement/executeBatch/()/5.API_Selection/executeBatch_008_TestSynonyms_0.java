public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtnumber1		number(10)"+")");
		user1Stmt.executeBatch();
		
		
		user1Stmt.executeUpdate("CREATE SYNONYM "+SYNONYM_PREFIX+"_0 "+	"FOR "+TABLE_PREFIX+"_0"
);
		user1Stmt.executeUpdate("CREATE SYNONYM "+SYNONYM_PREFIX+"_1 "+ "FOR S2ITest2."+TABLE_PREFIX+"_0");

		user1Stmt.close();
	}
}