public class func{
public void testClientIp(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select * from objecttable('teiid_context' COLUMNS y string 'teiid_row.session.IPAddress') as X"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    String value = rs.getString(1);
    assertNotNull(value);
}
}
