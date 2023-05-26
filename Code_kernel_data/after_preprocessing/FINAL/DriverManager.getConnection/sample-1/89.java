public class func{
public void testBaseTableCannotBeUsedInStatementsInMultitenantConnections(){
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_TENANT_SPECIFIC_URL);
                conn.createStatement().execute("select * from " + PARENT_TABLE_NAME);
}
}
