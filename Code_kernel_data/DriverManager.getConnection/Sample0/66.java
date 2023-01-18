//65
public class func{
	public void getConnectionWithMultiplyFunction(){
        DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
