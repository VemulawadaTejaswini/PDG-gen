public class func{
public void testVarbinaryArrayNotSupported(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY, a VARBINARY[10])");
}
}
