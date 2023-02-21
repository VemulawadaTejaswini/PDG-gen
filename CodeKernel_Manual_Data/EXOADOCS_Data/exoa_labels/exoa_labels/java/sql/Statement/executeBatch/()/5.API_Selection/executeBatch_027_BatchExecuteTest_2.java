public class A{
	public void testSelectThrowsException() throws Exception{
		Statement stmt = con.createStatement();
		
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 1 WHERE pk = 1");
		stmt.addBatch("SELECT col1 FROM testbatch WHERE pk = 1");
		stmt.addBatch("UPDATE testbatch SET col1 = col1 + 2 WHERE pk = 1");
		
		try{
			stmt.executeBatch();
			fail("Should raise a BatchUpdateException because of the SELECT");
		}
		catch (BatchUpdateException e){
			int [] updateCounts = e.getUpdateCounts();
			assertEquals(1, updateCounts.length);
			assertEquals(1, updateCounts[0]);
		}
		catch (SQLException e){
			fail( "Should throw a BatchUpdateException instead of " +"a generic SQLException: " + e);
		}
		
		stmt.close();
	}
}