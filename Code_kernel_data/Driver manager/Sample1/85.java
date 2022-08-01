//84
public class func{
	public void testOrderByOptimizedOut(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t(t_id VARCHAR NOT NULL, k1 VARCHAR, k2 VARCHAR, v1 VARCHAR," +
            " CONSTRAINT pk PRIMARY KEY(t_id, k1, k2)) multi_tenant=true");
}
}
