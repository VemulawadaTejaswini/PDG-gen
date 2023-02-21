public class A{
	public int[] executeBatch(Statement stmt) throws SQLException{
		int[] ret = stmt.executeBatch();
		stmt.clearBatch();
		return ret;
	}
}