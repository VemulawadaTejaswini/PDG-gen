public class A{
	//...
	public static void main(){
		Statement user1Stmt = user1Conn.createStatement();
		//...
		user1Stmt.executeBatch();
	}
}