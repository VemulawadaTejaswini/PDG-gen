//38
public class func{
public void testAddColsIntoSystemTable(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().executeUpdate("ALTER TABLE " + PhoenixDatabaseMetaData.SYSTEM_CATALOG +
          " ADD IF NOT EXISTS testNewColumn integer");
          conn.createStatement().executeQuery(query);
}
}
