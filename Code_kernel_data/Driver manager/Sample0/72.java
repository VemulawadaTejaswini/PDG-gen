//71
public class func{
	public void setUp(){
    Connection connection = DriverManager.getConnection("jdbc:optiq:");
    OptiqConnection optiqConnection = connection.unwrap(OptiqConnection.class);
    SchemaPlus rootSchema = optiqConnection.getRootSchema();
}
}
