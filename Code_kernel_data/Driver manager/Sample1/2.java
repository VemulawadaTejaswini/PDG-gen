//1
public class func{
	public void testLeadingPKWithTrailingRVC2(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        conn.createStatement().execute("CREATE TABLE in_test ( user VARCHAR, tenant_id VARCHAR(5) NOT NULL,tenant_type_id VARCHAR(3) NOT NULL,  id INTEGER NOT NULL CONSTRAINT pk PRIMARY KEY (tenant_id, tenant_type_id, id))");
        conn.createStatement().execute("upsert into in_test (tenant_id, tenant_type_id, id, user) values ('a', 'a', 1, 'BonA')");
        conn.createStatement().execute("upsert into in_test (tenant_id, tenant_type_id, id, user) values ('a', 'a', 2, 'BonB')");
}
}
