//23
public class func{
	public void getTableRowCount(Connection conn,String table){
    PreparedStatement statement = conn.prepareStatement("SELECT COUNT(*) FROM " + table);
      ResultSet rs = statement.executeQuery();
        if (rs.next()) {
          return rs.getInt(1);
        }
        rs.close();
}
}
