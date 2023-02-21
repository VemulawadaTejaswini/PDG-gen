public class A{
	public int executeBatch() {
		int result = 0;
		try {
			if (this.getStmt() != null) {
				this.getStmt().executeBatch();
			}
		} catch (final Exception e) {
			e.printStackTrace(System.err);
			result = -1;
		}
		return result;
	}
}