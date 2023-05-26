public class func{
public void testSelect(){
    Statement s = conn.createStatement();
    assertTrue(s.execute("select * from tables order by name"));
    TestMMDatabaseMetaData.compareResultSet(s.getResultSet());
}
}
