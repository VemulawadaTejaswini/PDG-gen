//44
public class func{
	public void testArrayAppendFunctionBigIntDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "BIGINT", "1112");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_APPEND(bigints,pk) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("BIGINT", longs);
}
}
