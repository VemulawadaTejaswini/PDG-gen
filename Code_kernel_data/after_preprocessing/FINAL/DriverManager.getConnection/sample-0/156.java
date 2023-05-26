public class func{
public void init(){
                DriverManager.getConnection(String.format("jdbc:mysql:
        DefaultDatabaseLoader defaultDatabaseLoader = new DefaultDatabaseLoader(jdbcConnection, dbName, dbPentahoDW);
        defaultDatabaseLoader.createDatabase();
        defaultDatabaseLoader.populateDatabase();
}
}
