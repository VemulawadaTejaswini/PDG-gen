public class A{
	public void close() throws IOException {
		if (!inTx) {
			try {
				
				try {
					executeBatch();
				} finally {
					if (connection != null && !connection.getAutoCommit()) {
						connection.commit();
					}
				}
				
			} catch (SQLException e) {
				JDBCPersistenceAdapter.log("Error while closing connection: ", e);
				throw IOExceptionSupport.create(e);
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (Throwable e) {
					LOG.warn("Close failed: " + e.getMessage(), e);
				} finally {
					connection = null;
				}
			}
		}
	}
}