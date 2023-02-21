public class A{
	public int[] executeBatch()throws  SQLException{
		int[] result = new int[0];
		
		Statement t_Statement = getPreparedStatement();
		
		if  (t_Statement != null){
			result = t_Statement.executeBatch();
		}
		
		return result;
	}
}