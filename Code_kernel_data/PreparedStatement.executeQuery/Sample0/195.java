//194
public class func{
	public void _assertNoSuchResourceBlock(long resourceBlockId){
    Connection connection = DataAccess.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(
      "SELECT * FROM ResourceBlock WHERE resourceBlockId = ?");
    preparedStatement.setLong(1, resourceBlockId);
    ResultSet resultSet = preparedStatement.executeQuery();
    Assert.assertFalse(resultSet.next());
    DataAccess.cleanUp(connection, preparedStatement, resultSet);
}
}
