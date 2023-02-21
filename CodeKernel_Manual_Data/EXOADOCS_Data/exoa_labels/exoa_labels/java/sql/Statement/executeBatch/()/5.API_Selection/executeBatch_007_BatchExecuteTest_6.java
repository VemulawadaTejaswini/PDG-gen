public class A{
	public void testBatchEscapeProcessing() throws SQLException{
		Statement stmt = con.createStatement();
		stmt.execute("CREATE TEMP TABLE batchescape (d date)");
		
		stmt.addBatch("INSERT INTO batchescape (d) VALUES ({d '2007-11-20'})");
		stmt.executeBatch();
		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO batchescape (d) VALUES ({d '2007-11-20'})");
		pstmt.addBatch();
		pstmt.executeBatch();
		pstmt.close();
		
		ResultSet rs = stmt.executeQuery("SELECT d FROM batchescape");
		assertTrue(rs.next());
		assertEquals("2007-11-20", rs.getString(1));
		assertTrue(rs.next());
		assertEquals("2007-11-20", rs.getString(1));
		assertTrue(!rs.next());
		rs.close();
		stmt.close();
	}
}