//26
public class func{
public void resetDatabase(String databaseName,Connection connection){
        Statement statement = connection.createStatement();
            statement.execute("USE " + databaseName);
            statement.close();
}
}
