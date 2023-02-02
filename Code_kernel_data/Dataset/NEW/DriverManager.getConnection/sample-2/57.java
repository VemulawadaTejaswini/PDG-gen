//57
public class func{
public void testArrayAppendFunctionVarcharDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "VARCHAR", "'e'");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_APPEND(varchars,pk) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("VARCHAR", strings);
}
}
