public class func{
public void testArrayConcatFunctionBigint(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(bigints,bigints) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("BIGINT", longs);
}
}
