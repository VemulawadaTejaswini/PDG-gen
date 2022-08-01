//51
public class func{
	public void testArrayConcatFunctionDouble(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(doubles,doubles) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("DOUBLE", doubles);
}
}
