public class func{
public void findMessagesByTimestampRange(Timestamp start,Timestamp end,ResultSet[] results){
    Connection conn = DriverManager.getConnection( "jdbc:default:connection" );
    PreparedStatement ps = conn.prepareStatement( "select * from msg where ts between ? and ?" );
}
}
