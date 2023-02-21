public class A{
	public void write()throws WriterException{
		init();
		
		String currentSQL = null;
		int sqlIndex = 0;
		try {
			HashMap<String, Object> params = getWriterParameters();
			if (params == null)throw new WriterException("Cannot get writer parameters! Returned HashMap is null");
			Connection connection = (Connection)params.get("connection");
			
			if (connection==null)throw new WriterException("Cannot get not-null connection! Set please connection to database in writer parameters");

			Statement stmt = connection.createStatement();
			
			try {
				if (commitBatchCount != 1) {
					connection.setAutoCommit(false);
				}
				
				int batchSize = 0;
				int commitIdx = 0;
				
				for (int i=0; i<getStorage().size(); i++) {
					String sql = getStorage().get(i);
					stmt.addBatch(sql);
					sqlIndex++;
					currentSQL = sql;
					if (++batchSize == batchCount) {
						batchSize = 0;
						stmt.executeBatch();
						if (commitBatchCount > 1 && commitBatchCount == ++commitIdx) {
							connection.commit();
							commitIdx = 0;
						}
						stmt.clearBatch();
					}
				}
				stmt.executeBatch();
				stmt.clearBatch();
				
				if (commitBatchCount != 1) {
					connection.commit();
				}
			} finally {
				stmt.close();
			}
		} catch (StorageException e) {
			throw new WriterException("cannot read data from temporary storage", e);
		} catch (SQLException e) {
			throw new WriterException("cannot write statement to database: " + sqlIndex + "\n" + e.getMessage() + "\n" + currentSQL, e);
		}
	}
}