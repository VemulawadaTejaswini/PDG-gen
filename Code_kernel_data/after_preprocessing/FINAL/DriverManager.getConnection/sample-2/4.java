public class func{
public void testArrayToStringFunctionWithNestedFunctions3(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_TO_STRING(ARRAY[ARRAY_ELEM(doubles, 1), ARRAY_ELEM(doubles, 1)], ', ') FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        assertEquals(expected, rs.getString(1));
        assertFalse(rs.next());
}
}
