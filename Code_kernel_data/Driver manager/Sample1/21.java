//20
public class func{
	public void testNullEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM TEST_TABLE WHERE pk = ENCODE(1, NULL)");
        assertFalse(rs.next());
}
}
