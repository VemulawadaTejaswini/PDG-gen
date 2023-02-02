//6
public class func{
public void execute(String query){
    Connection connection = DataSourceUtils.getConnection(dataSource);
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    return preparedStatement.executeQuery();
}
}
