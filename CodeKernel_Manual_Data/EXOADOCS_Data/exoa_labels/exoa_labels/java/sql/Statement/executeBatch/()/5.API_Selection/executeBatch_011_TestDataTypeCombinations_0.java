public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtBlob1			blob,"+	"dtBlob2			blob,"+	"dtBlob3			blob"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtClob1			clob,"+	"dtBlob1			blob,"+	"dtClob2			clob,"+	"dtBlob2			blob"+")");

		user1Stmt.executeBatch();
		
		
		user1Stmt.close();
	}
}