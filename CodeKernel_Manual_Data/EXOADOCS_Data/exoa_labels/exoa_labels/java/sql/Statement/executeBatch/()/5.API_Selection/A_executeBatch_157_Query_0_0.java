public class A{
	//...
	public static void main(){
		Statement t_Statement = getPreparedStatement();
		//...
		result = t_Statement.executeBatch();
	}
}