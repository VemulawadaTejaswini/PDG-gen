//48
public class func{
	public void testSplit_NoSplitString(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "CANNOT BE SPLIT");
        ResultSet rs = conn.createStatement().executeQuery(
                "SELECT REGEXP_SPLIT(VAL, ',') FROM SPLIT_TEST");
        assertTrue(rs.next());
        Array array = rs.getArray(1);
        String[] values = (String[]) array.getArray();
        assertArrayEquals(new String[] { "CANNOT BE SPLIT" }, values);
}
}
