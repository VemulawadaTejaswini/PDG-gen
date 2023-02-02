//18
public class func{
	public void makeImmutableAndDeleteData(){
        Connection conn = DriverManager.getConnection(getUrl(), PropertiesUtil.deepCopy(TEST_PROPERTIES));
            conn.setAutoCommit(true);
            conn.createStatement().execute("DELETE FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME);
            conn.createStatement().execute("ALTER TABLE " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME + " SET IMMUTABLE_ROWS=true");
            conn.createStatement().executeQuery("SELECT COUNT(*) FROM " + TestUtil.DEFAULT_DATA_TABLE_FULL_NAME).next();
}
}
