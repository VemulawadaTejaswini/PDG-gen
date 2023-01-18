//35
public class func{
	public void testOrderByNotDroppedCompositeKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE foo (j INTEGER NOT NULL, k BIGINT NOT NULL, v VARCHAR CONSTRAINT pk PRIMARY KEY (j,k)) IMMUTABLE_ROWS=true");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT * FROM foo ORDER BY k,j");
        assertFalse(plan.getOrderBy().getOrderByExpressions().isEmpty());
}
}
