//36
public class func{
	public void testInvalidEncodingType(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
            conn.createStatement().executeQuery(
                "SELECT * FROM test_table WHERE some_column = ENCODE(1, 'invalidEncodingFormat')");
}
}
