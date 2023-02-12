public class func{
public void testDifferentOperators(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcTestTemplates.differentOperatorsTest(conn);
}
}
