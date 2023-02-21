public class A{
	public void executeSqlBatch(String[] sqlStatements) throws SQLException {
		
		Statement statement = _Connection.createStatement();
		
		for (int i = 0; i < sqlStatements.length; i++) {
			String sql = sqlStatements[i];
			if (_Logger!=null)_Logger.debug("ExecuteSQL:executeSqlBatch(String[]): "+sql);
			statement.addBatch(sql);
		}
		statement.executeBatch();
	}
}