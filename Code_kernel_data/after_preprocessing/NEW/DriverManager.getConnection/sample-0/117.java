//117
public class func{
public void testCreateInsertAndUpdate(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcDataContext dc = new JdbcDataContext(conn);
        JdbcTestTemplates.simpleCreateInsertUpdateAndDrop(dc, "metamodel_test_simple");
}
}
