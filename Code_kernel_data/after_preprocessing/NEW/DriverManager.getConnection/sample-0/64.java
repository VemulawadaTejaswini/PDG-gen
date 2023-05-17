//64
public class func{
public void testSimple2(){
        DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
