//205
public class func{
	public void vetBytes_5679(Connection conn,byte[][] expected){
        PreparedStatement   ps = conn.prepareStatement( "select * from t_5679_2" );
        ResultSet   rs = ps.executeQuery();
        rs.next();
}
}
