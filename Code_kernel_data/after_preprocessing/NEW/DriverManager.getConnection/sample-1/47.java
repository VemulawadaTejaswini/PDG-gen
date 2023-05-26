//47
public class func{
public void testDuplicatePKColumn(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
}
}
