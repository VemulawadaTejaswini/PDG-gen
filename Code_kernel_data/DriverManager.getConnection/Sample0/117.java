//116
public class func{
	public void testCreateInsertAndUpdate(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:" + getName(), USERNAME, PASSWORD);
        JdbcDataContext dc = new JdbcDataContext(connection);
        JdbcTestTemplates.simpleCreateInsertUpdateAndDrop(dc, "metamodel_test_simple");
}
}
