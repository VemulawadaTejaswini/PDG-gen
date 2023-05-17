//227
public class func{
public void testExecutePreparedStatement(){
        final PreparedStatement ps = conn.prepareStatement("start n=node({1}) return ID(n) as id");
        ps.setLong(1,0L);
        final ResultSet rs = ps.executeQuery();
        assertTrue(rs.next());
        assertEquals(0, ((Number)rs.getObject("id")).intValue());
}
}
