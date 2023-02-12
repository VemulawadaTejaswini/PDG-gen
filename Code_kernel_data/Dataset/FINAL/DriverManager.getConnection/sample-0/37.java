public class func{
public void setUp(){
    hs2Conn = DriverManager.getConnection(miniHS2.getJdbcURL(dbName),
        System.getProperty("user.name"), "bar");
    stmt = hs2Conn.createStatement();
    stmt.execute("USE " + dbName);
}
}
