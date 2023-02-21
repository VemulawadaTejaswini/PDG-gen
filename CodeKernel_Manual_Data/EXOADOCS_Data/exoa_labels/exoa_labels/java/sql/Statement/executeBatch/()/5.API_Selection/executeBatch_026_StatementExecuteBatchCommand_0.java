public class A{
	public Object execute(Object target, ConnectionContext ctx) throws SQLException {
		Statement stmt = (Statement)target;
		stmt.clearBatch();
		for(int i = 0; i < _sql.length; i++) {
			stmt.addBatch(ctx.resolveOrCheckQuery(_sql[i]));
		}
		return stmt.executeBatch();
	}
}