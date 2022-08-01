//67
public class func{
	public void getConnectionWithMultiplyFunction(){
        DriverManager.getConnection("jdbc:optiq:");
        connection.unwrap(OptiqConnection.class);
    SchemaPlus rootSchema = optiqConnection.getRootSchema();
}
}
