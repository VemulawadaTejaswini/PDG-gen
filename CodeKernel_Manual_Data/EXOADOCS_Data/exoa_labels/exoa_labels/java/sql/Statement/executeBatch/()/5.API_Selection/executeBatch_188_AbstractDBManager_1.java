public class A{
	public void executeBatch(InsertBatch insertQueryBatch) throws Exception {
		Statement statement = null;
		int executedCount = 0;
		
		try {
			if(insertQueryBatch != null) {
				prepareDataSource();
				statement = getConnection().createStatement();
				for(int x=0; x < insertQueryBatch.getBatchSize(); x++) {
					statement.addBatch(insertQueryBatch.getQuery(x));
				}
				
				executedCount=statement.executeBatch().length;
				if(executedCount!=insertQueryBatch.getBatchSize()) {
					throw new Exception("Partial batch execution, rolling back. Executed ["+executedCount+"] queries , expected ["+insertQueryBatch.getBatchSize()+"].");
				}
				commitTransaction();
				
				if(statement!=null) statement.close();
				statement=null;
				insertQueryBatch.removeAllQueries();
			} else {
				logger.severe("The insert query batch should not be null.");
			}
		} catch (Exception e) {
			if(statement!=null) statement.close();
			rollbackTransaction();
			if(logger.getLevel()==Level.FINEST) e.printStackTrace();
			throw e;
		}
	}
}