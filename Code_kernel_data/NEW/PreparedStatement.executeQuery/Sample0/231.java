//230
public class func{
	public void queryLong(){
        final PreparedStatement preparedStatement = conn.prepareStatement("SELECT count(*) FROM DomainEventEntry e");
        final ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getLong(1);
}
}
