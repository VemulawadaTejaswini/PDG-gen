public class A{
	public void commit() throws SQLException{
		executeBatch();
		_statements.clear();
		getDelegate().commit();
	}
}