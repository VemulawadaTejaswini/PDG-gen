//26
public class func{
public void testFloatingPointUpsert(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
