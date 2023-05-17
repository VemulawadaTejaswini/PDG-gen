//49
public class func{
public void testArrayFillFunctionWithNestedFunctions3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_FILL(3.4, ARRAY_LENGTH(ARRAY[34, 45])) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
}
}
