public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtvarchar1		varchar(100),"+	"dtvarchar2		varchar2(1000),"+	"dtDate1		Date			default sysdate,"+	"dtnumber1		number(10,2) 	NOT NULL,"+	"dtnumber2		number(10)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtvarchar1		varchar(100),"+	"dtvarchar2		varchar2(1000)	,"+	"dtDate1		Date			default sysdate,"+	"dtnumber1		number(10,2) 	NOT NULL,"+	"dtnumber2		number(10) 		UNIQUE"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_2 ("+	"dtvarchar1		varchar(100),"+	"dtvarchar2		varchar2(1000),"+	"dtDate1		Date			default sysdate,"+	"dtnumber1		number(10,2) 	NOT NULL,"+	"dtnumber2		number(10) 		UNIQUE"+")");
		user1Stmt.executeBatch();
		
		user1Stmt.execute("insert into "+TABLE_PREFIX+"_0 values("+	"'10', '10', null, 10, 10"+")");
		user1Stmt.execute("insert into "+TABLE_PREFIX+"_0 values("+	"'11', '11', null, 11, 11"+")");

		user1Stmt.execute("insert into "+TABLE_PREFIX+"_1 values("+	"'20', '20', null, 20, 20"+")");

		user1Stmt.execute("insert into "+TABLE_PREFIX+"_2 values("+	"'30', '30', null, 30, 30"+")");


		user1Stmt.executeUpdate("create view "+VIEW_PREFIX+"_0 AS "+	"Select dtvarchar1, dtNumber2 "+	"from "+TABLE_PREFIX+"_0 "+	"where dtNumber2 > 10");

		user1Stmt.executeUpdate("create view "+VIEW_PREFIX+"_1 AS "+	"Select t1.dtvarchar1 C, t2.dtNumber2 as C2 "+	"from "+TABLE_PREFIX+"_0 t1, "+TABLE_PREFIX+"_1 t2 "+	"where t1.dtNumber2 < 11");

		user1Stmt.executeUpdate("create view "+VIEW_PREFIX+"_2 AS "+	"Select t1.dtvarchar1, t2.dtnumber1, t3.dtnumber2 "+	"from "+TABLE_PREFIX+"_0 t1, "+TABLE_PREFIX+"_1 t2, "+TABLE_PREFIX+"_2 t3");


		user1Stmt.close();
	}
}