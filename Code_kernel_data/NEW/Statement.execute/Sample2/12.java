//11
public class func{
	public void shutdown(DataSource dataSource,String databaseName){
        java.sql.Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();
        stmt.execute("SHUTDOWN");
}
}
