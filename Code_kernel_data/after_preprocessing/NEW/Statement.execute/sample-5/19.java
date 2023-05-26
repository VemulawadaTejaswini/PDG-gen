//19
public class func{
public void testPreparedUpdate(){
    Statement stmt = conn.createStatement();
    assertFalse(stmt.execute("create local temporary table x (y string)"));
    PreparedStatement ps = conn.prepareStatement("delete from x");
    assertFalse(ps.execute());
    assertNull(ps.getMetaData());
}
}
