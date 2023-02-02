//0
public class func{
public void testControl(){
        Statement stat = conn.createStatement();
        stat.execute("create alias overload0 for \"" + ME + ".overload0\"");
        ResultSet rs = stat.executeQuery("select overload0() from dual");
        assertTrue(rs.next());
        assertEquals("0 args", 0, rs.getInt(1));
        assertFalse(rs.next());
        rs = meta.getProcedures(null, null, "OVERLOAD0");
        assertFalse(rs.next());
}
}
