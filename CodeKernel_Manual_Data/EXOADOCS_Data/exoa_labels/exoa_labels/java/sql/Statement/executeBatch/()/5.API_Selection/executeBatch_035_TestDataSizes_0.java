public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtChar1		char(10),"+	"dtChar2		char(1000),"+	"dtChar3		char(2000)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtFloat1		float(10),"+	"dtFloat2		float(50),"+	"dtFloat3		float(60),"+	"dtFloat4		float(126)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_2 ("+	"dtNChar1		nchar(10),"+	"dtNChar2		nchar(500),"+	"dtNChar3		nchar(1000)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_3 ("+	"dtNumber1		number(10,0),"+	"dtNumber2		number(10,10),"+	"dtNumber3		number(38,10),"+	"dtNumber4		number(38,38),"+	"dtNumber5		number(38,0)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_4 ("+	"dtvarchar1		varchar(10),"+	"dtvarchar2		varchar(1000),"+	"dtvarchar3		varchar(4000)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_5 ("+	"dtvarchar21		varchar2(10),"+	"dtvarchar22		varchar2(1000),"+	"dtvarchar23		varchar2(4000)"+")");
		user1Stmt.executeBatch();
		
		user1Stmt.close();
	}
}