//19
public class func{
	public void doCreateDb(String user){
    Connection connection = context.createConnection(user);
    Statement statement = connection.createStatement();
    statement.execute("CREATE DATABASE " + dbName);
    statement.close();
}
}
