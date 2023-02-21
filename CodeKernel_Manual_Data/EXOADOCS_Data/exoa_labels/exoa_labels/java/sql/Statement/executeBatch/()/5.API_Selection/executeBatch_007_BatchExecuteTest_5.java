public class A{
	public void testWarningsAreCleared() throws SQLException{
		Statement stmt = con.createStatement();
		stmt.addBatch("CREATE TEMP TABLE unused (a int primary key)");
		stmt.executeBatch();
		stmt.executeBatch();
		assertNull(stmt.getWarnings());
		stmt.close();
	}
}