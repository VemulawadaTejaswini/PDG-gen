//217
public class func{
	public void testRemotePrepareExecute(){
        remoteConnection.prepareStatement("select * from \"hr\".\"emps\"");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      ++count;
    }
}
}
