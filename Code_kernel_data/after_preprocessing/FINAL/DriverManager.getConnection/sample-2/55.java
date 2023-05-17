public class func{
public void testArrayAppendFunctionBooleanDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "BOOLEAN", "false");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_APPEND(bools,pk) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("BOOLEAN", booleans);
}
}
