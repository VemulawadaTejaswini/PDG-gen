public class A{
	public void executeBatchIfNecessary() throws SQLException{
		if (count >= MAX_COUNT){
			executeBatch();
		}
	}
}