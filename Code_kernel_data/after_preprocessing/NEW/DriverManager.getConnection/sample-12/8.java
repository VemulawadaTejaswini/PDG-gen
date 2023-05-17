//8
public class func{
public void testDegenerateRowKeyFilter(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        bindParams(pstmt, binds);
        QueryPlan plan = pstmt.optimizeQuery();
        assertDegenerate(plan.getContext());
}
}
