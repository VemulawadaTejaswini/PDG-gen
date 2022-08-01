//59
public class func{
	public void get(String id){
    PreparedStatement stmt = connection.prepareStatement("SELECT " + FIELDS + " FROM " + TABLE_NAME + " WHERE ID = ?");
    stmt.setString(1, id);
    ResultSet rs = stmt.executeQuery();
    if (rs.next()) {
      result = buildHeaderFromResultSet(rs);
    } 
    rs.close();
}
}
