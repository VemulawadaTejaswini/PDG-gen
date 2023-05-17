public class func{
public void testByteInstrAscendingFilter(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ASC", "abcdefghijkl","fgh");
        testInstrFilter(conn, queryToExecute,"abcdefghijkl");
}
}
