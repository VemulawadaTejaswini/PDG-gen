public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtvarchar1		varchar(100),"+	"dtvarchar2		varchar(1000),"+	"dtDate1		Date			default current_date,"+	"dtnumber1		numeric(10,2) 	NOT NULL,"+	"dtnumber2		numeric(10)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtvarchar1		varchar(100),"+	"dtvarchar2		varchar(1000)	,"+	"dtDate1		Date			default current_date,"+	"dtnumber1		numeric(10,2) 	NOT NULL,"+	"dtnumber2		numeric(10) 		UNIQUE NOT NULL"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_2 ("+	"dtvarchar1		varchar(100),"+	"dtvarchar2		varchar(1000),"+	"dtDate1		Date			default current_date,"+	"dtnumber1		numeric(10,2) 	NOT NULL,"+	"dtnumber2		numeric(10) 		UNIQUE NOT NULL"+")");
		user1Stmt.executeBatch();
		
		
		
		user1Stmt.executeUpdate("create view "+VIEW_PREFIX+"_0 AS "+	"Select dtvarchar1, dtNumber2 "+	"from "+TABLE_PREFIX+"_0 "+	"where dtNumber2 > 10");

		user1Stmt.executeUpdate("create view "+VIEW_PREFIX+"_1 AS "+	"Select t1.dtvarchar1 C, t2.dtNumber2 as C2 "+	"from "+TABLE_PREFIX+"_0 t1, "+TABLE_PREFIX+"_1 t2 "+	"where t1.dtNumber2 > 10");

		user1Stmt.executeUpdate("create view "+VIEW_PREFIX+"_2 AS "+	"Select t1.dtvarchar1, t2.dtnumber1, t3.dtnumber2 "+	"from "+TABLE_PREFIX+"_0 t1, "+TABLE_PREFIX+"_1 t2, "+TABLE_PREFIX+"_2 t3");


		user1Stmt.close();
	}
}