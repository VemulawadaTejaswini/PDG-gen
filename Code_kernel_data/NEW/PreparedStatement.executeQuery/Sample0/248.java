//247
public class func{
	public void selectBlob(Connection con,int key){
    PreparedStatement stmt = con.prepareStatement("SELECT value,key FROM blobtest where key = ?");
    stmt.setInt(1, key);
    ResultSet rs = stmt.executeQuery();
    assertTrue ("Executed", rs != null);
    rs.next();
    System.err.println ("blob record \"" + rs.getBlob(1).toString() + "\" key " + rs.getString(2) );
    assertTrue (" Only one record ", rs.isLast());
    Blob b = rs.getBlob(1);
}
}
