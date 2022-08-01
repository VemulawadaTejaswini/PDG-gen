//46
public class func{
	public void routineExists(Connection conn,String functionName){
        PreparedStatement ps = chattyPrepare( conn, "select count (*) from sys.sysaliases where alias = ?" );
        ps.setString( 1, functionName );
        ResultSet rs = ps.executeQuery();
        rs.next();
        boolean retval = rs.getInt( 1 ) > 0 ? true : false;
        rs.close();
}
}
