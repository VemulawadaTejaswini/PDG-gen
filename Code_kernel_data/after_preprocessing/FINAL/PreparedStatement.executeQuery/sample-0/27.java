public class func{
public void aliasExists(Connection conn,String aliasName){
        PreparedStatement   ps = conn.prepareStatement( "select count(*) from sys.sysaliases where alias = ?" );
        ps.setString( 1, aliasName );
        ResultSet   rs = ps.executeQuery();
        rs.next();
        int retval = rs.getInt( 1 );
        rs.close();
}
}
