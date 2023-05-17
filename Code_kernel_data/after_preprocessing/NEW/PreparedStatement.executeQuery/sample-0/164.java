//164
public class func{
public void getDatabaseProperty(Connection conn,String key){
        PreparedStatement   ps = chattyPrepare( conn, "values( syscs_util.syscs_get_database_property( '" + key + "' ) )" );
        ResultSet   rs = ps.executeQuery();
            rs.next();
            return rs.getString( 1 );
            rs.close();
}
}
