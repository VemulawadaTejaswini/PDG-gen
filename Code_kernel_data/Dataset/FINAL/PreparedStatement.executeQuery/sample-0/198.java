public class func{
public void contains(String cacheEntryName){
      PreparedStatement stmt = conn.prepareStatement("SELECT key FROM " + TABLE_NAME + " WHERE key = ?;");
      stmt.setString(1, cacheEntryName);
      ResultSet result = stmt.executeQuery();
      boolean b = result.next();
}
}
