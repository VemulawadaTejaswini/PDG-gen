//4
public class func{
public void compileStatement(String query,List<Object> binds){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES)).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        TestUtil.bindParams(pstmt, binds);
        QueryPlan plan = pstmt.compileQuery();
        assertTrue(plan instanceof AggregatePlan);
        Filter filter = plan.getContext().getScan().getFilter();
        assertTrue(filter == null || filter instanceof BooleanExpressionFilter);
        BooleanExpressionFilter boolFilter = (BooleanExpressionFilter)filter;
}
}
