//10
public class func{
public void openConnection(){
    Connection connection = DriverManager.getConnection( getJdbcurl() );
    connection.setAutoCommit( false );
}
}
