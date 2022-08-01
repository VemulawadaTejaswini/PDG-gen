//0
public class func{
	public void testDisallowDropOfColumnOnParentTable(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(ddl);
            conn.createStatement().execute("ALTER TABLE tp DROP COLUMN v1");
}
}
