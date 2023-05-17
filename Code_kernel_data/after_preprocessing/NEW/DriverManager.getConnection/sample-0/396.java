//396
public class func{
public void testAutomaticConversionWhenInsertingString(){
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:auto_conversion", USERNAME, PASSWORD);
        JdbcTestTemplates.automaticConversionWhenInsertingString(connection);
}
}
