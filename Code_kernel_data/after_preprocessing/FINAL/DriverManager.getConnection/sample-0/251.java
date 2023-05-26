public class func{
public void testInterpretationOfNull(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcTestTemplates.interpretationOfNulls(conn);
}
}
