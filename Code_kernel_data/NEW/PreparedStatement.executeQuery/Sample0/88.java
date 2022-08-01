//87
public class func{
	public void getStringValue(String table,String fieldToGet,String fieldToMatchAgainst,String valueToMatchAgainst){
      PreparedStatement prep = dbInstance.prepareStatement("select " + fieldToGet + " from " + table + " where " + fieldToMatchAgainst + " = ?;");
      prep.setString(1, valueToMatchAgainst);
      ResultSet rs = prep.executeQuery();
      rs.next();
      String value = rs.getString(fieldToGet);
      rs.close();
}
}
