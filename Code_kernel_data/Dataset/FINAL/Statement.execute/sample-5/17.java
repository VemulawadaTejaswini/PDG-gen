public class func{
public void testTransactionCycle(){
    conn.setAutoCommit(false); 
    Statement s = conn.createStatement();
    assertTrue(s.execute("select * from tables order by name"));
    conn.setAutoCommit(true);
}
}
