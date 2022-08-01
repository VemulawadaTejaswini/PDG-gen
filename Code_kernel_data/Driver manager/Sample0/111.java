//110
public class func{
	public void testWorkingWithDates(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        final JdbcDataContext dc = new JdbcDataContext(conn);
        final Schema schema = dc.getDefaultSchema();
        JdbcTestTemplates.createInsertAndUpdateDateTypes(dc, schema, "test_table");
}
}
