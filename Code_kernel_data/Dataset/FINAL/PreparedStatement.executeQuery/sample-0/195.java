public class func{
public void tableExists(ResourceContext<PostgresDatabaseComponent> context){
            statement.setString(1, getSchemaNameFromContext(context));
            statement.setString(2, getTableNameFromContext(context));
            resultSet = statement.executeQuery();
            return resultSet.next();
            safeClose(connection, statement, resultSet);
}
}
