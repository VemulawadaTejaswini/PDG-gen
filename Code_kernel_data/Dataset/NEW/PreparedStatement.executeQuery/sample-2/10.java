//10
public class func{
public void findUserIds(ResultSet[] results){
    Connection conn = DriverManager.getConnection( "jdbc:default:connection" );
    PreparedStatement ps = conn.prepareStatement( "select id from t_user" );
    results[0] = ps.executeQuery();
}
}
