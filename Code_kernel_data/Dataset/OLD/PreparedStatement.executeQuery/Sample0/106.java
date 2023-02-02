//105
public class func{
	public void getCurrentScn(Connection connection){
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
    resultSet.next();
    long result = resultSet.getLong(1);
    resultSet.close();
}
}
