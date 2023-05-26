public class func{
public void testInvalidTimeout(){
        connection.setAutoCommit(true);
        PreparedStatement statement = connection.prepareStatement("select 'hello'");
            statement.setQueryTimeout(-1);
        ResultSet resultSet = statement.executeQuery();
        resultSet.close();
}
}
