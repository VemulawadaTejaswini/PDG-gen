//14
public class func{
public void testViewAddsClashingPKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
