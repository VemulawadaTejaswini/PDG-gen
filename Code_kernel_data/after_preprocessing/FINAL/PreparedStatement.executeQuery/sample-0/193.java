public class func{
public void _assertResourceBlockReferenceCount(long resourceBlockId,long expectedCountValue){
    Connection connection = DataAccess.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(
      "SELECT referenceCount FROM ResourceBlock WHERE " +
        "resourceBlockId = " + resourceBlockId);
    ResultSet resultSet = preparedStatement.executeQuery();
    Assert.assertTrue(resultSet.next());
    Assert.assertEquals(expectedCountValue, resultSet.getLong(1));
    DataAccess.cleanUp(connection, preparedStatement, resultSet);
}
}
