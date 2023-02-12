public class func{
public void testLocalIndexRoundTrip(){
        createBaseTable(TestUtil.DEFAULT_DATA_TABLE_NAME, null, null);
        Connection conn1 = DriverManager.getConnection(getUrl());
        conn1.createStatement().execute("CREATE LOCAL INDEX " + TestUtil.DEFAULT_INDEX_TABLE_NAME + " ON " + TestUtil.DEFAULT_DATA_TABLE_NAME + "(v1)");
        conn1.createStatement().executeQuery("SELECT * FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME).next();
}
}
