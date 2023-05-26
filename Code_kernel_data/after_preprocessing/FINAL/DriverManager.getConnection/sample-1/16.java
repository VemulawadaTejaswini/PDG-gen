public class func{
public void testOrderByOptimizedOut(){
        conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("CREATE VIEW v(v2 VARCHAR) AS SELECT * FROM t WHERE k1 = 'a'");
        conn.createStatement().execute("CREATE INDEX i1 ON v(v2) INCLUDE(v1)");
        ResultSet rs = conn.createStatement().executeQuery("EXPLAIN SELECT v1,v2 FROM v WHERE v2 > 'a' ORDER BY v2");
        assertEquals("CLIENT PARALLEL 1-WAY RANGE SCAN OVER _IDX_T ['me',-32768,'a'] - ['me',-32768,*]",
                QueryUtil.getExplainPlan(rs));
}
}
