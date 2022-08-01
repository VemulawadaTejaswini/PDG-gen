//242
public class func{
	public void testInterpretationOfNull(){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:interpretation_of_null", USERNAME, PASSWORD);
        JdbcTestTemplates.interpretationOfNulls(conn);
}
}
