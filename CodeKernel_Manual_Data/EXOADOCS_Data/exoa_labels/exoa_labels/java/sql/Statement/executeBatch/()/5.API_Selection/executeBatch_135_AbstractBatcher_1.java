public class A{
	public PreparedStatement prepareStatement(String sql, boolean getGeneratedKeys)throws SQLException, HibernateException {
		executeBatch();
		logOpenPreparedStatement();
		return getPreparedStatement(connectionManager.getConnection(),sql,false,getGeneratedKeys,null,null,false);
	}
}