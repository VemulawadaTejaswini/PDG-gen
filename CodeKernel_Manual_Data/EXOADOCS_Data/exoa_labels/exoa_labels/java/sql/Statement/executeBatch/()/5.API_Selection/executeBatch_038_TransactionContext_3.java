public class A{
	public void commit() throws IOException {
		if (!inTx) {
			throw new IOException("Not started.");
		}
		try {
			executeBatch();
			if (!connection.getAutoCommit()) {
				connection.commit();
			}
		} catch (SQLException e) {
			JDBCPersistenceAdapter.log("Commit failed: ", e);
			throw IOExceptionSupport.create(e);
		} finally {
			inTx = false;
			close();
		}
	}
}