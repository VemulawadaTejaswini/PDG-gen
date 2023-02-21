public class A{
	//...
	public static void main(){
		Statement statement = connection.createStatement();
		//...
		statement.executeBatch();
	}
}