public class A{
	public int batchStore() {
		int result = 0;
		try {
			this.getStmt().executeBatch();
		} catch (final Exception e) {
			e.printStackTrace(System.err);
			result = -1;
		}
		return result;
	}
}