//33
public class func{
	public void testUnsupportedEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
            conn.createStatement().executeQuery("SELECT * FROM TEST_TABLE WHERE pk = ENCODE(1, 'HEX')");
}
}
