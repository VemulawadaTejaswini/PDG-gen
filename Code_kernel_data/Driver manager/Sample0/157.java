//156
public class func{
	public void init(){
                DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/?%s", host, port, params), user, password);
        DefaultDatabaseLoader defaultDatabaseLoader = new DefaultDatabaseLoader(jdbcConnection, dbName, dbPentahoDW);
        defaultDatabaseLoader.createDatabase();
        defaultDatabaseLoader.populateDatabase();
}
}
