//70
public class func{
public void testNotNullConstraintForWithSinglePKCol(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            conn.createStatement().execute(ddl);    
}
}
