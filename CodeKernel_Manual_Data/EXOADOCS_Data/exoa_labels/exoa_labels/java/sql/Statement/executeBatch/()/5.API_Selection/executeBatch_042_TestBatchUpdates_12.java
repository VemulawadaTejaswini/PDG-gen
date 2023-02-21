public class A{
	private void testExecuteBatch07() throws SQLException {
		trace("testExecuteBatch07");
		boolean batchExceptionFlag = false;
		String selectCoffee = COFFEE_SELECT1;
		trace("selectCoffee = " + selectCoffee);
		Statement stmt = conn.createStatement();
		stmt.addBatch(selectCoffee);
		try {
			int[] updateCount = stmt.executeBatch();
			trace("updateCount Length : " + updateCount.length);
		} catch (BatchUpdateException be) {
			batchExceptionFlag = true;
		}
		if (batchExceptionFlag) {
			trace("executeBatch select");
		} else {
			fail("executeBatch");
		}
	}
}