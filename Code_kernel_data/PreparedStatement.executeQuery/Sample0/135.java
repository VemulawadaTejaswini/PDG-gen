//134
public class func{
	public void is_duplicate_update(Receipt inReceipt){
      stmt.setString(1, new String(inReceipt.getSHA1()));
      ResultSet rs = stmt.executeQuery();
      if( rs.next() )
        return true;
}
}
