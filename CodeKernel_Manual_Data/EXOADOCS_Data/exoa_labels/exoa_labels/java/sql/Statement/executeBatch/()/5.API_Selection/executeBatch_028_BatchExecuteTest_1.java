public class A{
	public void testClearBatch() throws Exception{
		Statement stmt = con.createStatement();
		
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 1 WHERE pk = 1");
		assertCol1HasValue(0);
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 2 WHERE pk = 1");
		assertCol1HasValue(0);
		stmt.clearBatch();
		assertCol1HasValue(0);
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 4 WHERE pk = 1");
		assertCol1HasValue(0);
		stmt.executeBatch();
		assertCol1HasValue(4);
		con.commit();
		assertCol1HasValue(4);
		
		stmt.close();
	}
}