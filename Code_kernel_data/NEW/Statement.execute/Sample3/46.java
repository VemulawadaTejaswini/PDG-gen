//45
public class func{
	public void populateDb(){
        Connection connection = connectionPool.getConnection();
        Statement statement = connection.createStatement();
        statement.execute(insertSql);
        statement.close();
}
}
