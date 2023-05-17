public class func{
public void testAddColumnsUsingNewConnection(){
        Connection conn1 = DriverManager.getConnection(getUrl(), props);
        conn1.createStatement().execute(ddl);
        conn1.createStatement().execute(ddl);
        conn1.createStatement().execute(ddl);
        conn1.createStatement().execute(ddl);
}
}
