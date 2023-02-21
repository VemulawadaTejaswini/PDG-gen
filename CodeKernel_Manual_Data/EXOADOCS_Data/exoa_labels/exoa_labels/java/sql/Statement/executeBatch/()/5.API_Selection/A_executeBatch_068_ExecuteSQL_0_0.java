public class A{
	//...
	public static void main(){
		Statement statement = _Connection.createStatement();
		//...
		statement.executeBatch();
	}
}