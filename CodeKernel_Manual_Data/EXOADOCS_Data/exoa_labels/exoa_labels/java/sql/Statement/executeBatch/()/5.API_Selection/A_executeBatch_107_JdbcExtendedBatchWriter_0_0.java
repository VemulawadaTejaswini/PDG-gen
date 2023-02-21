public class A{
	//...
	public static void main(){
		Statement stmt = connection.createStatement();
		//...
		stmt.executeBatch();
	}
}