public class A{
	public int[] executeBatch() throws SQLException {
		return this.getTarget().executeBatch();
	}
}