//212
public class func{
	public void testPreparedStatementFetch(){
        PreparedStatement statement = connection.prepareStatement(FETCH_QUERY);
        statement.setQueryTimeout(1);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
            }
}
}
