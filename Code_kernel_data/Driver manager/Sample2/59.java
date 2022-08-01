//58
public class func{
	public void testArrayPrependFunctionIntegerDesc(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTablesDesc(conn, "INTEGER", "23");
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND(pk,integers) FROM regions");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("INTEGER", integers);
}
}
