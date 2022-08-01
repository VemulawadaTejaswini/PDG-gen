//208
public class func{
	public void getScalarLong(PreparedStatement ps){
        ResultSet rs = ps.executeQuery();
        rs.next();
        long retval = rs.getLong( 1 );
        rs.close();
}
}
