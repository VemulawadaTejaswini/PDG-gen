public class func{
public void testUnknownColumnInPKConstraint(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
