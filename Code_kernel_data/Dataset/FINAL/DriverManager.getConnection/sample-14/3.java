public class func{
public void compileStatement(String query){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES)).unwrap(PhoenixConnection.class);
        PhoenixPreparedStatement pstmt = new PhoenixPreparedStatement(pconn, query);
        QueryPlan plan = pstmt.compileQuery();
        return plan.getContext().getScan().getFilter();
}
}
