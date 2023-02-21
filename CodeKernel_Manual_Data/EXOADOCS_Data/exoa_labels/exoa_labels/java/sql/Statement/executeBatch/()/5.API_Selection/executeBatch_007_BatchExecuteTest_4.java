public class A{
	public void testTransactionalBehaviour() throws Exception{
		Statement stmt = con.createStatement();
		
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 1 WHERE pk = 1");
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 2 WHERE pk = 1");
		stmt.executeBatch();
		con.rollback();
		assertCol1HasValue(0);
		
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 4 WHERE pk = 1");
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 8 WHERE pk = 1");
		
		assertCol1HasValue(0);
		
		int[] updateCounts = stmt.executeBatch();
		assertEquals(2, updateCounts.length);
		assertEquals(1, updateCounts[0]);
		assertEquals(1, updateCounts[1]);
		
		assertCol1HasValue(12);
		con.commit();
		assertCol1HasValue(12);
		con.rollback();
		assertCol1HasValue(12);
		
		stmt.close();
	}
}