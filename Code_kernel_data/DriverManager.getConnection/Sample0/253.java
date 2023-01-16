//252
public class func{
	public void testCharOfSizeOne(){
        Connection conn = DriverManager.getConnection("jdbc:derby:target/temp_derby;create=true");
        JdbcTestTemplates.meaningOfOneSizeChar(conn);
}
}
