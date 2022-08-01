//14
public class func{
	public void hashmapReader(){
        Connection conn = DriverManager.getConnection( "jdbc:default:connection" );
        PreparedStatement ps = conn.prepareStatement( "select intCol, hashmapCol from t_11" );
        return ps.executeQuery();
}
}
