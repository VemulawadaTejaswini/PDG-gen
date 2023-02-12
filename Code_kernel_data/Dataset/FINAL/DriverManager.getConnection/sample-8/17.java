public class func{
public void createSequence(String sequenceName){
        Connection  conn = DriverManager.getConnection( "jdbc:default:connection" );
        conn.prepareStatement( "create sequence " + sequenceName ).execute();
}
}
