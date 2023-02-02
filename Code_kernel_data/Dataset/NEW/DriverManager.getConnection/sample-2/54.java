//54
public class func{
public void testArrayConcatFunctionChar(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTables(conn);
        rs = conn.createStatement().executeQuery("SELECT ARRAY_CAT(chars,chars) FROM regions WHERE region_name = 'SF Bay Area'");
        assertTrue(rs.next());
        Array array = conn.createArrayOf("CHAR", strings);
}
}
