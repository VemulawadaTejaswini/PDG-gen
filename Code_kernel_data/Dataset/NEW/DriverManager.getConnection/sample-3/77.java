//77
public class func{
public void findMessagesByDate(java.sql.Date date,ResultSet[] results){
    Connection conn = DriverManager.getConnection( "jdbc:default:connection" );
    PreparedStatement ps = conn.prepareStatement( "select * from msg where post_date=?" );
    ps.setDate( 1, date );
    results[0] = ps.executeQuery();
}
}
