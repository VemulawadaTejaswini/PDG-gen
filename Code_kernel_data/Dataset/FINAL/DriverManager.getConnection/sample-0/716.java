public class func{
public void HSQLDatabase(String databaseName){
      conn = DriverManager.getConnection(jdbcURL + ";create=true", 
          HSQL_USER, HSQL_PASS);
}
}
