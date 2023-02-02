//7
public class func{
public void testAndFalseFilter(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES)).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = newPreparedStatement(pconn, query);
        QueryPlan plan = pstmt.optimizeQuery();
        assertDegenerate(plan.getContext());
}
}
