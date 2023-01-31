//121
public class func{
	public void isPublicIPAllocated(long ip,long vlanDbId,PreparedStatement stmt){
          stmt.clearParameters();
          stmt.setLong(2, vlanDbId);
          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
                return (rs.getString("allocated") != null);
            } else {
                return false;
            }
}
}
