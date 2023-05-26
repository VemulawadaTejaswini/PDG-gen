public class func{
public void findOneUser(ResultSet[] results){
    Connection conn = DriverManager.getConnection( "jdbc:default:connection" );
    PreparedStatement ps = conn.prepareStatement( "select id, name from t_user where name=?" );
    ps.setString( 1, "steve" );
    results[0] = ps.executeQuery();
}
}
