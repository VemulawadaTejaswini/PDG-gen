//40
public class func{
public void testTransactionCycleDisabled(){
    assertTrue(s.execute("select * from tables order by name"));
    conn.setAutoCommit(true);
}
}
