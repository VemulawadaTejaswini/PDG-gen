public class func{
public void testCreateViewDefinesPKConstraint(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
}
}
