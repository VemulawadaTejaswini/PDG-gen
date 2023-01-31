//123
public class func{
	public void testInvalidUpsertSelect(){
        PhoenixConnection conn = DriverManager.getConnection(getUrl(), props).unwrap(PhoenixConnection.class);
        conn.createStatement().execute("CREATE TABLE t1 (k1 INTEGER NOT NULL, k2 VARCHAR, v VARCHAR, CONSTRAINT pk PRIMARY KEY (k1,k2))");
        conn.createStatement().execute("CREATE TABLE t2 (k3 INTEGER NOT NULL, v VARCHAR, CONSTRAINT pk PRIMARY KEY (k3))");
        conn.createStatement().execute("CREATE VIEW v1 AS SELECT * FROM t1 WHERE k1 = 1");
            conn.createStatement().executeUpdate("UPSERT INTO v1 SELECT k3,'foo',v FROM t2");
}
}
