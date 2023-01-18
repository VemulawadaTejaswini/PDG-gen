//173
public class func{
	public void testDropPKColumn(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 5));
        Connection conn1 = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            conn1.createStatement().executeUpdate("ALTER TABLE " + ATABLE_NAME + " DROP COLUMN entity_id");
}
}
