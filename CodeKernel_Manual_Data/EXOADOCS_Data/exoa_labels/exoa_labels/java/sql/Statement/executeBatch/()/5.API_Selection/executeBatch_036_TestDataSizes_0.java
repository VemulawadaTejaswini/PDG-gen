public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtChar1		char(10),"+	"dtChar2		char(100),"+	"dtChar3		char(200)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtFloat1		float(10),"+	"dtFloat2		float(50),"+	"dtFloat3		float(50),"+	"dtFloat4		float(51s)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_3 ("+	"dtNumber1		numeric(10,0),"+	"dtNumber2		numeric(10,10),"+	"dtNumber3		Decimal(20,10),"+	"dtNumber4		numeric(20,10),"+	"dtNumber5		numeric(25,0)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_4 ("+	"dtvarchar1		varchar(10),"+	"dtvarchar2		varchar(1000),"+	"dtvarchar3		varchar(3700)"+")");
		user1Stmt.executeBatch();
		
		user1Stmt.close();
	}
}