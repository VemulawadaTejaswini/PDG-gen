public class A{
	//...
	public static void main(){
		Statement stmt = con.createStatement();
		//...
		int[] updateCounts = stmt.executeBatch();
	}
}