//3
public class func{
	public void testDeleteFromImmutableWithKV(){
        Connection conn = DriverManager.getConnection(getUrl());
            conn.createStatement().execute(ddl);
            conn.createStatement().execute(indexDDL);
            conn.createStatement().execute("DELETE FROM t");
}
}
