public class A{
	public int[] executeBatch() throws java.sql.SQLException {
		checkActive();
		int[] answer = myRawResourceComponent().executeBatch();
		return answer;
	}
}