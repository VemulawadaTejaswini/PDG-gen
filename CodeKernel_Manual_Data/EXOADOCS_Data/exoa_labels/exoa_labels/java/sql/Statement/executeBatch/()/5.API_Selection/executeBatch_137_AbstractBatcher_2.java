public class A{
	public PreparedStatement prepareStatement(String sql, String[] columnNames)throws SQLException, HibernateException {
		executeBatch();
		logOpenPreparedStatement();
		return getPreparedStatement(connectionManager.getConnection(),sql,false,false,columnNames,null,false);
	}
}