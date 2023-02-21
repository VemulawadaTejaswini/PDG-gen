public class A{
	public void executeSqlBatch(BufferedReader stream) throws IOException, SQLException {
		
		Statement statement = _Connection.createStatement();
		boolean done = false;
		
		while (!done) {
			String sql = "";
			
			while (sql.indexOf(';')<0) {
				String line = stream.readLine();
				if (line!=null) {
					line = line.trim();
					int comment = line.indexOf("--");
					if (comment>=0)line = line.substring(0,comment);
					if (line.length()>0)sql += line +  " ";
				}
				else {
					done = true;
					break;
				}
			}
			sql = sql.trim();
			
			if (sql.length()>0 && !sql.startsWith("--")) {
				if (_Logger!=null)_Logger.debug("ExecuteSQL:executeSqlBatch(BufferedReader): "+sql);

				statement.addBatch(sql);
			}
		}
		statement.executeBatch();
	}
}