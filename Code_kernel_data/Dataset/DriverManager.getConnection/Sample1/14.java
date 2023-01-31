//13
public class func{
	public void testRVCUsingPkColsReturnedByPlanShouldUseIndex(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE T (k VARCHAR NOT NULL PRIMARY KEY, v1 CHAR(15), v2 VARCHAR)");
        conn.createStatement().execute("CREATE INDEX IDX ON T(v1, v2)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery(query);
        assertEquals("IDX", plan.getTableRef().getTable().getTableName().getString());
}
}
