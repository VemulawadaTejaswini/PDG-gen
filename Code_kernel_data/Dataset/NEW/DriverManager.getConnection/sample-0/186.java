//186
public class func{
public void testMultiByteReverseAscending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", s);
        testReverse(conn, s);
}
}
