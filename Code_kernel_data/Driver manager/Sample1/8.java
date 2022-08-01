//7
public class func{
	public void testIsNullInCompositeKey(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE T(k1 VARCHAR, k2 VARCHAR, CONSTRAINT pk PRIMARY KEY (k1,k2))");
        conn.createStatement().execute("UPSERT INTO T VALUES (null,'a')");
        conn.createStatement().execute("UPSERT INTO T VALUES ('a','a')");
}
}
