public class func{
public void testUpperCaseEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}
