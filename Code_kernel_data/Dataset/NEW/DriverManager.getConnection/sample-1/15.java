//15
public class func{
public void testChooseIndexFromOrderBy(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k INTEGER NOT NULL PRIMARY KEY, v1 VARCHAR, v2 VARCHAR) IMMUTABLE_ROWS=true");
        conn.createStatement().execute("CREATE INDEX idx ON t(v1)");
        PhoenixStatement stmt = conn.createStatement().unwrap(PhoenixStatement.class);
        QueryPlan plan = stmt.optimizeQuery("SELECT k FROM t WHERE k = 30 ORDER BY v1 LIMIT 5");
        assertEquals("IDX", plan.getTableRef().getTable().getTableName().getString());
}
}
