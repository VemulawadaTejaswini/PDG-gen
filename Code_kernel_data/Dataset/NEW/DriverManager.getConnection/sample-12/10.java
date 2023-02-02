//10
public class func{
public void testPaddedRowKeyFilter(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        bindParams(pstmt, binds);
        QueryPlan plan = pstmt.optimizeQuery();
        Scan scan = plan.getContext().getScan();
        assertEquals(0,scan.getStartRow().length);
        assertEquals(0,scan.getStopRow().length);
        assertNotNull(scan.getFilter());
}
}
