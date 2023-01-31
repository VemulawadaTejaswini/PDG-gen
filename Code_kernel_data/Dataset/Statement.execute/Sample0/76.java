//75
public class func{
	public void adminCreate(String db,String table){
    Connection connection = context.createConnection(ADMIN1);
    Statement statement = context.createStatement(connection);
    statement.execute("CREATE DATABASE " + db);
}
}
