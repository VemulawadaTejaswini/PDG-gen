//79
public class func{
	public void dropDatabases(){
        statement.execute("drop database if exists " + defaultDatabaseLoader.getDbName());
}
}
