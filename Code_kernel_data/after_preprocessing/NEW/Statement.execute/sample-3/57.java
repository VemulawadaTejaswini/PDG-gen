//57
public class func{
public void testCreateSchema(){
        derbyHelper.start();
        derbyHelper.dropAndCreateSomething();
        final Connection conn = derbyHelper.getConnection();
        final Statement stmt = conn.createStatement();
        assertTrue(stmt.execute("select count(*) from something"));
        stmt.close();
}
}
