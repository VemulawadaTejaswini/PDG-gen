//2
public class func{
public void testOrFalseFilter(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        QueryPlan plan = pstmt.optimizeQuery();
        Scan scan = plan.getContext().getScan();
        Filter filter = scan.getFilter();
}
}
