//9
public class func{
public void testDegenerateBiggerThanMaxLengthVarchar(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        bindParams(pstmt, binds);
        QueryPlan plan = pstmt.optimizeQuery();
        assertDegenerate(plan.getContext());
}
}
