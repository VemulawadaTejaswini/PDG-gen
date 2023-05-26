public class func{
public void setUp(){
    Connection connection = DriverManager.getConnection("jdbc:calcite:");
        connection.unwrap(CalciteConnection.class);
    SchemaPlus rootSchema = calciteConnection.getRootSchema();
}
}
