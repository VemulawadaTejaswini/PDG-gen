public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtnumber1		number(10) UNIQUE"+")");
		user1Stmt.executeBatch();
		
		
		
		user1Stmt.executeUpdate("create or replace function "+FUNCTION_PREFIX+"_0 ( "+	"arg_number1 IN "+TABLE_PREFIX+"_0.dtnumber1%TYPE "+	") Return INTEGER AS "
+	"arg_number1_null EXCEPTION; "+	"curNumber "+TABLE_PREFIX+"_0%ROWTYPE; "+	"numberToReturn "+TABLE_PREFIX+"_0.dtnumber1%TYPE; "
+	"cursor cur_findArg is "+	"select * "+	"from  "+TABLE_PREFIX+"_0 "+	"where dtnumber1 = arg_number1; "
+"BEGIN "+	"if arg_number1 is NULL then "+	"raise arg_number1_null; "+	"end if; "
+	"numberToReturn := 0; "
+	"open cur_findArg; "+	"loop "+	" fetch cur_findArg into CurNumber; "+	" exit when cur_findArg%NOTFOUND; "+	" numberToReturn := numberToReturn + 1; "+	"end loop; "+	"close cur_findArg; "
+	"return numberToReturn; "
+"EXCEPTION "+	"when arg_number1_null then "+	" DBMS_OUTPUT.put_line('ERROR: arg_number_1 is null.'); "+	" return -1;"
+	"when OTHERS then "+	" DBMS_OUTPUT.put_line('ERROR: Unknown error in execution. Contact the DBA!'); "+	" return -1;"+"END;");

		user1Stmt.close();
	}
}