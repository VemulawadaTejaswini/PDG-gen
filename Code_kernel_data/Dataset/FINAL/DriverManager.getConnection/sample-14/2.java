public class func{
public void testScanCaching_CustomFetchSizeOnStatement(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES)).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = newPreparedStatement(pconn, query);
        pstmt.setFetchSize(FETCH_SIZE);
        QueryPlan plan = pstmt.optimizeQuery();
        Scan scan = plan.getContext().getScan();
}
}
