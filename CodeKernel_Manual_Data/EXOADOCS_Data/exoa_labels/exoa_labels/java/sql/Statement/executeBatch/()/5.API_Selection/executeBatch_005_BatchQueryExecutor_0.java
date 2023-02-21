public class A{
	protected final void run() throws SQLException {
		ConnectionFactory con = ConnectionFactory.get();
		boolean verbose = con.verbose.get();
		for(Object bean : beans) {
			if(verbose) {
				con.log("Executing SQL query with bean - " + bean);
			}
			doQuery(bean);
			getStatement().addBatch();
		}
		getStatement().executeBatch();
	}
}