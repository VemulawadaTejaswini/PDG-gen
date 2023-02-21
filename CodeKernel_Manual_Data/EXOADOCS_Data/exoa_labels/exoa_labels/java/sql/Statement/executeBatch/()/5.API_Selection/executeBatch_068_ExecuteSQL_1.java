public class A{
	public void executeSqlBatch(Collection sqlStatements) throws SQLException {
		
		Statement statement = _Connection.createStatement();
		
		for (Iterator iter = sqlStatements.iterator(); iter.hasNext();) {
			String sql = (String) iter.next();
			if (_Logger!=null)_Logger.debug("ExecuteSQL:executeSqlBatch(Collection): "+sql);
			statement.addBatch(sql);
		}
		statement.executeBatch();
	}
}