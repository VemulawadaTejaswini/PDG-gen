//6
public class func{
public void testInListWithAnd2FilterScanKey(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        QueryPlan plan = pstmt.optimizeQuery();
        Scan scan = plan.getContext().getScan();
}
}
