//70
public class func{
	public void isPrivateIPAllocated(String ip,long podId,long zoneId,PreparedStatement stmt){
      stmt.clearParameters();
          stmt.setString(1, ip);
          stmt.setLong(3, podId);
          ResultSet rs = stmt.executeQuery();
          if (rs.next()) {
                return (rs.getString("taken") != null);
            } else {
                return false;
            }
}
}
