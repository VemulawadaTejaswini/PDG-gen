//1
public class func{
public void RSMDWrapper(Connection conn,String query){
        PreparedStatement ps = conn.prepareStatement( query );
        ResultSet rs = ps.executeQuery();
        _rsmd = rs.getMetaData();
        _rowCount = _rsmd.getColumnCount();
}
}
