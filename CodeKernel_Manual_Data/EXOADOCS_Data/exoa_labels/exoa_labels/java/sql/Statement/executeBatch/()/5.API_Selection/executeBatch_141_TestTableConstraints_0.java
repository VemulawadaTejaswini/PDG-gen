public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Con) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtvarchar1		varchar(100)    ,"+	"dtvarchar2		varchar2(1000)	,"+	"dtDate1		Date			default sysdate,"+	"dtnumber1		number(10,2) 	NOT NULL,"+	"dtnumber2		number(10) 		UNIQUE,"+	"constraint pk_testTable_Constraints_0 PRIMARY KEY(dtvarchar1)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtvarchar1		varchar(100)	,"+	"dtvarchar2		varchar2(1000)	,"+	"dtDate1		Date			,"+	"dtnumber1		number(10,2) 	NOT NULL,"+	"dtnumber2		number(10) 		UNIQUE,"+	"constraint pk_testTable_Constraints_1 PRIMARY KEY(dtvarchar1),"+	"constraint fk_testTable_Constraints_1_a FOREIGN KEY(dtvarchar1) references testTable_Constraints_0(dtvarchar1),"+	"constraint fk_testTable_Constraints_1_b FOREIGN KEY(dtnumber2) references testTable_Constraints_0(dtnumber2)"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_2 ("+	"dtvarchar1		varchar(100)	,"+	"constraint fk_testTable_Constraints_2 FOREIGN KEY(dtvarchar1) references testTable_Constraints_0(dtvarchar1) on delete cascade"+")");
		user1Stmt.executeBatch();
		
		user1Stmt.addBatch("insert into "+TABLE_PREFIX+"_0 values ('1', '1', sysdate, 1, 1)");
		user1Stmt.addBatch("insert into "+TABLE_PREFIX+"_0 values ('2', '2', sysdate, 1, 2)");
		user1Stmt.addBatch("insert into "+TABLE_PREFIX+"_0 values ('50', '50', null, 50, 50)");
		user1Stmt.addBatch("insert into "+TABLE_PREFIX+"_0 values ('60', '60', null, 60, 60)");
		
		user1Stmt.addBatch("insert into "+TABLE_PREFIX+"_1 values ('1', '1', null, 1, 1)");
		user1Stmt.addBatch("insert into "+TABLE_PREFIX+"_1 values ('2', '2', null, 1, 1)");
		
		user1Stmt.close();
	}
}