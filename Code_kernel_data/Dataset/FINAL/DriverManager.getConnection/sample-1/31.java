public class func{
public void testInvalidArrayElemRefInUpsert(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY, a INTEGER[10], B INTEGER[10])");
            conn.createStatement().execute("UPSERT INTO t(k,a[2]) VALUES('A', 5)");
}
}
