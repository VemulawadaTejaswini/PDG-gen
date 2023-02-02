//0
public class func{
public void testTimezoneWithSeconds(){
        if (!TestUtil.haveMinimumServerVersion(con, "8.2"))
            return;
        Statement stmt = con.createStatement();
        stmt.execute("SET TimeZone = 'Europe/Paris'");
        ResultSet rs = stmt.executeQuery("SELECT '1920-01-01'::timestamptz");
        rs.next();
        assertEquals(-1577923200000L, rs.getTimestamp(1).getTime());
}
}
