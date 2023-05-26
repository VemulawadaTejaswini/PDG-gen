public class func{
public void testHalfHourTimezone(){
        Statement stmt = con.createStatement();
        stmt.execute("SET TimeZone = 'GMT+3:30'");
        ResultSet rs = stmt.executeQuery("SELECT '1969-12-31 20:30:00'::timestamptz");
        assertTrue(rs.next());
        assertEquals(0L, rs.getTimestamp(1).getTime());
}
}
