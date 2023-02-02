//0
public class func{
public void testPkPrepared(){
    PreparedStatement stmt = conn.prepareStatement("select ta.attname, ia.attnum, ic.relname, n.nspname, tc.relname " +//$NON-NLS-1$
        "from pg_catalog.pg_attribute ta, pg_catalog.pg_attribute ia, pg_catalog.pg_class tc, pg_catalog.pg_index i, " +//$NON-NLS-1$
        "pg_catalog.pg_namespace n, pg_catalog.pg_class ic where tc.relname = E'pg_attribute' AND n.nspname = E'pg_catalog'");
    ResultSet rs = stmt.executeQuery();
    TestMMDatabaseMetaData.compareResultSet(rs);
}
}
