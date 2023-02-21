public class A{
	//...
	public static void main(){
		Statement stmt = m_DBConnection.createStatement();
		//...
		stmt.executeBatch();
	}
}