//38
public class func{
public void loadMacsIfNescessary(){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT macs FROM accounts WHERE id = ?");
      ps.setInt(1, accId);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        for (String mac : rs.getString("macs").split(", ")) {
          if (!mac.equals("")) {
            macs.add(mac);
          }
        }
      }
      rs.close();
}
}
