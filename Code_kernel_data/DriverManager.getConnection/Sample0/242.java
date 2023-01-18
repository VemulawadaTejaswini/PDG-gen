//241
public class func{
	public void testCharOfSizeOn(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:char_of_size_one", USERNAME, PASSWORD);
        JdbcTestTemplates.meaningOfOneSizeChar(connection);
}
}
