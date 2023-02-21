public class A{
	public void setUp() throws Exception {
		dao = JDBCUtil.getInstance();
		
		Connection connection = ((JDBCUtil)dao).getConnection();
		Statement statement = connection.createStatement();
		
		statement.addBatch( DBHelper.businessProcess );
		statement.addBatch( DBHelper.instance );
		statement.addBatch( DBHelper.task );
		statement.addBatch( DBHelper.token );
		statement.addBatch( DBHelper.uniqueKey );
		statement.addBatch( DBHelper.userInfo );
		
		statement.executeBatch();
	}
}