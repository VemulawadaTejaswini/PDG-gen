public class func{
public void tearDown(){
         DriverManager.registerDriver( new org.h2.Driver() );
         Connection connection = DriverManager.getConnection( url , user , passwd );
         connection.createStatement( ).execute( "DROP TABLE IF EXISTS " + streamName );
}
}
