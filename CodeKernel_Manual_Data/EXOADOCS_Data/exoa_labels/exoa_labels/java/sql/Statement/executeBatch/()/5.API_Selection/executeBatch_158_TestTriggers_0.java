public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtnumber1		number(10)   NOT NULL"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtnumber1		number(10)   NOT NULL"+")");
		user1Stmt.executeBatch();
		
		
		user1Stmt.executeUpdate("create trigger "+TRIGGER_PREFIX+"_0 "+	"after delete on "+TABLE_PREFIX+"_0 "+	"for each row "+"BEGIN "+	"insert into "+TABLE_PREFIX+"_1 values(old.dtnumber1); "+"END "+TRIGGER_PREFIX+"_0");

		user1Stmt.close();
	}
}