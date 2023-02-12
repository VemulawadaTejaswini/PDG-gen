public class func{
public void setup(){
        Connection conn = DriverManager.getConnection( "jdbc:hsqldb:mem:graphgisttests;shutdown=true" );
        conn.setAutoCommit( true );
        state = new State( engine, database, conn, null, "" );
}
}
