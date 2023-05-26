public class func{
public void getConnection(){
        if ( _conn != null ) { return _conn; }
        _conn = DriverManager.getConnection( connectionURL );
        _conn.setAutoCommit( false );
}
}
