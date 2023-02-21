public class A{
	public void testExecuteEmptyBatch() throws Exception{
		Statement stmt = con.createStatement();
		int[] updateCount = stmt.executeBatch();
		assertEquals(0, updateCount.length);
		
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 1 WHERE pk = 1");
		stmt.clearBatch();
		updateCount = stmt.executeBatch();
		assertEquals(0, updateCount.length);
		stmt.close();
	}
}