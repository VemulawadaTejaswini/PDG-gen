//29
public class func{
public void containsTable(String table,Connection connection){
    PreparedStatement stmt = connection.prepareStatement("SELECT COUNT(*) AS ct FROM sqlite_master WHERE type = ? AND name = ?");
    stmt.setString(2, table);
    ResultSet resultSet = stmt.executeQuery();
      return resultSet.next() && resultSet.getInt("ct") > 0;
      resultSet.close();
}
}
