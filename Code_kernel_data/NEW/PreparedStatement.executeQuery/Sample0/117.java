//116
public class func{
	public void isExpired(String cacheEntryName){
      PreparedStatement stmt = conn
          .prepareStatement("SELECT expiration_date FROM " + TABLE_NAME + " WHERE key = ?;");
      stmt.setString(1, cacheEntryName);
      ResultSet result = stmt.executeQuery();
      if (result.next()) {
        Timestamp timestamp = result.getTimestamp("expiration_date");
        long expirationDate = timestamp.getTime();
        stmt.close();
        return expirationDate < System.currentTimeMillis();
      }
}
}
