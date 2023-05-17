public class func{
public void verifyReturnType(String functionName,String expectedReturnType){
        println( functionName + " should have return type = " + expectedReturnType );
        PreparedStatement ps = prepareStatement(ddl);
        ps.setString(1, functionName);
        JDBC.assertSingleValueResultSet(ps.executeQuery(), expectedReturnType);
}
}
