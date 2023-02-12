public class func{
public void testArrayPrependFunctionNulls1(){
        conn = DriverManager.getConnection(getUrl());
        rs = conn.createStatement().executeQuery("SELECT ARRAY_PREPEND(b,a) FROM t WHERE k = 'a'");
        assertTrue(rs.next());
        assertEquals(array2, rs.getArray(1));
}
}
