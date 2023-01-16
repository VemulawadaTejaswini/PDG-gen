//20
public class func{
	public void doDropDb(String user){
    Connection connection = context.createConnection(user);
    Statement statement = connection.createStatement();
    statement.execute("DROP DATABASE IF EXISTS " + dbName + " CASCADE");
    statement.close();
}
}
