public class A{
	public void testExecuteBatch07() throws SQLException {
		trace("testExecuteBatch07");
		boolean bexpflag = false;
		String sSelCoffee = COFFEE_SELECT1;
		trace("sSelCoffee = " + sSelCoffee);
		Statement stmt = conn.createStatement();
		stmt.addBatch(sSelCoffee);
		try {
			int[] updateCount = stmt.executeBatch();
			trace("updateCount Length : " + updateCount.length);
		} catch (BatchUpdateException be) {
			bexpflag = true;
		}
		if (bexpflag) {
			trace("executeBatch select");
		} else {
			error("executeBatch");
		}
	}
}