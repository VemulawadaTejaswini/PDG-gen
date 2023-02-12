public class func{
public void testArray(Connection conn){
        prep.setObject(1, new Object[] { new BigDecimal("1"), "2" });
        ResultSet rs = prep.executeQuery();
        rs.next();
        assertEquals("1", rs.getString(1));
        rs.next();
        assertEquals("2", rs.getString(1));
        assertFalse(rs.next());
}
}
