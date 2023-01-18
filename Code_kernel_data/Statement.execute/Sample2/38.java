//37
public class func{
	public void doInConnection(java.sql.Connection connection){
                Statement statement = connection.createStatement();
                statement.execute("set constraints all deferred;");
}
}
