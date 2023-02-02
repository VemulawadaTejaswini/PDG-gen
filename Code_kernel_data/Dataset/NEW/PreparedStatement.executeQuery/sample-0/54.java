//54
public class func{
public void getUserNameInternal(){
            connection = getPooledConnectionProvider().getPooledConnection();
            statement = connection.prepareStatement(FIND_ROLE_BY_OID);
            statement.setLong(1, pgRoleOid);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("rolname");
            }
            safeClose(connection, statement, resultSet);
}
}
