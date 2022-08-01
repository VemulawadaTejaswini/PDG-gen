//111
public class func{
	public void testWorkingWithDates(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:working_with_dates", USERNAME, PASSWORD);
        final JdbcDataContext dc = new JdbcDataContext(connection);
        final Schema schema = dc.getDefaultSchema();
        JdbcTestTemplates.createInsertAndUpdateDateTypes(dc, schema, "test_table");
}
}
