public class A{
	//...
	public static void main(){
		Statement stmt = con.createStatement();
		//...
		stmt.executeBatch();
	}
}