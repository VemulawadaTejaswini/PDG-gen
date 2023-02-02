//51
public class func{
public void load(int cid){
      Connection con = (Connection) DatabaseConnection.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT * FROM maplestocks_data WHERE cid = ?");
      ps.setInt(1, cid);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        ret.add(new Pair<String ,Integer>(MapleStocks.getInstance().tickerOf(rs.getInt("stockid")), rs.getInt("shares")));
      }
}
}
