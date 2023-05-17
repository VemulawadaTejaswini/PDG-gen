public class func{
public void findMessagesByTime(java.sql.Time time,ResultSet[] results){
    Connection conn = DriverManager.getConnection( "jdbc:default:connection" );
    PreparedStatement ps = conn.prepareStatement( "select * from msg where post_time=?" );
    ps.setTime( 1, time );
    results[0] = ps.executeQuery();
}
}
