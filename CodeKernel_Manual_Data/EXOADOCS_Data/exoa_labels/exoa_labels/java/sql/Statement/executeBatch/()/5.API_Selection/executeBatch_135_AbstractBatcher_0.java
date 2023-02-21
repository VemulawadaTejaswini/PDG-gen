public class A{
	public CallableStatement prepareCallableStatement(String sql)throws SQLException, HibernateException {
		executeBatch();
		logOpenPreparedStatement();
		return getCallableStatement( connectionManager.getConnection(), sql, false);
	}
}