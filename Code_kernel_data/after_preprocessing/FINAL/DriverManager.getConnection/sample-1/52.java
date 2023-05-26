public class func{
public void testKeyValueColumnInPKConstraint(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
