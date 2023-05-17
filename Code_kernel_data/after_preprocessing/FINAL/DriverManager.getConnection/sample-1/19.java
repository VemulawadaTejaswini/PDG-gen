public class func{
public void testOrderByDropped(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute("CREATE TABLE foo (k VARCHAR NOT NULL PRIMARY KEY, v VARCHAR) IMMUTABLE_ROWS=true");
            PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
            QueryPlan plan = stmt.optimizeQuery("SELECT * FROM foo ORDER BY 'a','b','c'");
            assertTrue(plan.getOrderBy().getOrderByExpressions().isEmpty());
            conn.close();
}
}
