public class func{
public void testCompositePrimaryKeyCreation(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcDataContext dc = new JdbcDataContext(conn);
        JdbcTestTemplates.compositeKeyCreation(dc, "metamodel_test_composite_keys");
}
}
