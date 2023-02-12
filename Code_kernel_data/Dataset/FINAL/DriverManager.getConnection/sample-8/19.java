public class func{
public void runStatementAndRaiseError(String text){
        Connection  conn = DriverManager.getConnection( "jdbc:default:connection" );
        conn.prepareStatement( text ).execute();
}
}
