public class func{
public void loadAll(){
      Connection con = (Connection) DatabaseConnection.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT * FROM maplestocks ORDER BY stockid");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        stocks.add(new MapleStock(rs.getString("name"), rs.getString("ticker"), rs.getInt("count"), rs.getInt("value"), rs.getInt("change")));
      }
}
}
