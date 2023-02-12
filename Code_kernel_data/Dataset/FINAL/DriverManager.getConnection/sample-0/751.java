public class func{
public void setUp(){
        Connection connection = DriverManager.getConnection(Framework.getProperty(URL_PROPERTY));
            doOnAllTables(connection, null, null, "DROP TABLE [%s]"); // no CASCADE...
            checkSupports(connection);
}
}
