//175
public class func{
	public void retrieve_long(long inID,String inField){
      PreparedStatement stmt = mDB.prepareStatement("SELECT " + inField + " FROM state WHERE remote_id = ?");
      stmt.setLong(1, inID);
      ResultSet rs = stmt.executeQuery();
      if( rs.next() == false )
        return -1;
      return rs.getLong(1);
}
}
