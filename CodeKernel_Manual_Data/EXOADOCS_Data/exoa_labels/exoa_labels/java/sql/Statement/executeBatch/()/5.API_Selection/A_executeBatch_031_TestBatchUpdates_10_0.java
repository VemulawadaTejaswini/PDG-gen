public class A{
	//...
	public static void main(){
		Statement stmt = conn.createStatement();
		//...
		int[] updateCount = stmt.executeBatch();
	}
}