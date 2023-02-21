public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtvarchar1			varchar(500),"+	"dtvarchar2			varchar(1000),"+	"dtvarchar3			varchar(1500),"+	"dtnumber1			numeric(25,10),"+	"dtfloat1			float(50),"+	"dtblob1			blob"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtvarchar1			varchar(1000),"+	"dtvarchar2			varchar(2000),"+	"dtnumber1			numeric(20,5),"+	"dtnumber2			numeric(20,5)"+")");
		user1Stmt.executeBatch();
		
		
		user1Stmt.close();
	}
}