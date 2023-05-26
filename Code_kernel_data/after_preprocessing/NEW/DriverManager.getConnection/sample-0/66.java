//66
public class func{
public void testDifferentTypesSameFields(){
    Connection connection = DriverManager.getConnection("jdbc:optiq:");
        connection.unwrap(OptiqConnection.class);
    final SchemaPlus rootSchema = optiqConnection.getRootSchema();
}
}
