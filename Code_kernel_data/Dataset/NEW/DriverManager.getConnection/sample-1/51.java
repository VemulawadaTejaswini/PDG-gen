//51
public class func{
public void testInvalidNullCompositePrimaryKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k1 varchar, k2 varchar, constraint pk primary key(k1,k2))");
}
}
