//96
public class func{
	public void prepare(DataSource dataSource){
    final Connection connection = dataSource.getConnection();
    PreparedStatement preparedStatement = connection
        .prepareStatement("SELECT * FROM user_tables WHERE table_name = 'JTA_TEST'");
    final ResultSet resultSet = preparedStatement.executeQuery();
    if (resultSet.next()) {
      connection.prepareStatement("DROP TABLE jta_test").execute();
    }
    connection.prepareStatement(
        "CREATE TABLE jta_test (some_string VARCHAR2(10))").execute();
}
}
