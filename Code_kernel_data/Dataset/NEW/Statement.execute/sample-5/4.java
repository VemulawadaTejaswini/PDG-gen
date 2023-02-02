//4
public class func{
public void testVarbinary(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select X'aab1'"));
    s.getResultSet().next();
    byte[] bytes = s.getResultSet().getBytes(1);
}
}
