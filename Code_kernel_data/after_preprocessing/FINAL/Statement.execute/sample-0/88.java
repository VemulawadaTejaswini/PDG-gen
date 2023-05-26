public class func{
public void testTableExists(){
    String tableName = getFreeTableName();
    statement.execute("Create table " + tableName + " (id VARCHAR(255))");
    Assert.assertTrue(dbAccessor.tableExists(tableName));
}
}
