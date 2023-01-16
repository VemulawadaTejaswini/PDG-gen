//68
public class func{
	public void testSimple(){
        DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
