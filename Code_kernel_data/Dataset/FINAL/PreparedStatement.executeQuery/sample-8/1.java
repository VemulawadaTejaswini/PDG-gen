public class func{
public void testColumnMetadataWithAlias(){
    PreparedStatement stmt = conn.prepareStatement("select ta.attname as x from pg_catalog.pg_attribute ta limit 1");
    ResultSet rs = stmt.executeQuery();
    TestMMDatabaseMetaData.compareResultSet(rs);
}
}
