public class func{
public void getIdentitySequenceName(Connection conn,String tableName){
        ps.setString( 1, tableName.toUpperCase() );
        ResultSet   rs = ps.executeQuery();
        rs.next();
        String  uuidString = rs.getString( 1 );
        rs.close();
}
}
