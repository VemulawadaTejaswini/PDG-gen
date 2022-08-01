//61
public class func{
	public void getUserOid(String user,PooledConnectionProvider pooledConnectionProvider){
            connection = pooledConnectionProvider.getPooledConnection();
            statement = connection.prepareStatement(FIND_ROLE_BY_NAME);
            statement.setString(1, user);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getLong("oid");
            }
            safeClose(connection, statement, resultSet);
}
}
