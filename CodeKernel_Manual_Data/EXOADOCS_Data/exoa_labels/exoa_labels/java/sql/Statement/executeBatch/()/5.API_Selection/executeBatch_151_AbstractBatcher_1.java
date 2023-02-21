public class A{
	public PreparedStatement prepareStatement(String sql, boolean getGeneratedKeys, String[] pkColumnNames)throws SQLException, HibernateException {
		executeBatch();
		logOpenPreparedStatement();
		return getPreparedStatement( connectionManager.getConnection(), sql, false, getGeneratedKeys, pkColumnNames, null, false );
	}
}