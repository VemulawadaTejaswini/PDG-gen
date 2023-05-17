//4
public class func{
public void getForeignConnection(String connectionURL,Connection foreignConnection){
        Connection  conn = _connections.get( connectionURL );
        if ( conn == null )
        {
            conn = DriverManager.getConnection( connectionURL );

            if ( conn != null ) { _connections.put( connectionURL, conn ); }
        }
}
}
