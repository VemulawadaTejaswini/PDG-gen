//4
public class func{
	public void testChooseIndexFromHint(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k INTEGER NOT NULL PRIMARY KEY, v1 VARCHAR, v2 VARCHAR) IMMUTABLE_ROWS=true");
        conn.createStatement().execute("CREATE INDEX idx1 ON t(v1) INCLUDE(v2)");
        conn.createStatement().execute("CREATE INDEX idx2 ON t(v1,v2)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT /*+ INDEX(t  idx1) */ k FROM t WHERE v1 = 'foo' AND v2 = 'bar'");
        assertEquals("IDX1", plan.getTableRef().getTable().getTableName().getString());
}
}
