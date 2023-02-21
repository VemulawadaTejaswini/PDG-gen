public class A{
	public void setUseBatchInserts(boolean useBatchInserts){
		_useBatchInserts = useBatchInserts;
	}
	
	void nextExecuted(String sql) throws SQLException{
		count++;
		
		if (_order.contains(sql)){
			return;
		}
		
		String sqlCmd = sql.substring(0, 7);
		String tableName = rest.substring(0, rest.indexOf(' '));
		HashSet fkTables = (HashSet) _fkInfo.get(tableName);
		
		if (_touched.contains(tableName)){
			executeBatch();
		}
		if (sqlCmd.equals("INSERT ")){
			if (_dontInsert != null && _dontInsert.contains(tableName)){
				executeBatch();
			}
		}
		else{

			if (_deleted != null && fkTables != null){
				HashSet intersection = (HashSet) _deleted.clone();
				
				intersection.retainAll(fkTables);
				if (!intersection.isEmpty()){
					executeBatch();
				}
			}
		}
		
		_order.add(sql);
		
		_touched.add(tableName);
		if (sqlCmd.equals("INSERT ")){
			if (fkTables != null){
				if (_dontInsert == null){
					_dontInsert = new HashSet();
				}
				_dontInsert.addAll(fkTables);
			}
		}
		else if (sqlCmd.equals("DELETE ")){
			if (_deleted == null){
				_deleted = new HashSet();
			}
			_deleted.add(tableName);
		}
	}
}