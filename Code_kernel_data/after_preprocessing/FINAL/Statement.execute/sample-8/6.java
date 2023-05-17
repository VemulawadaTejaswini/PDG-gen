public class func{
public void test_pg_client_encoding(){
    Statement s = conn.createStatement();
    ResultSet rs = s.executeQuery("select pg_client_encoding()");
    rs.next();
    assertEquals("UTF8", rs.getString(1));
    s.execute("set client_encoding UTF8");
    rs = s.executeQuery("select pg_client_encoding()");
    rs.next();
    assertEquals("UTF8", rs.getString(1));
}
}
