//44
public class func{
public void getNXCode(String code,String type){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT `" + type + "` FROM nxcode WHERE code = ?");
      ps.setString(1, code);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        item = rs.getInt(type);
      }
      rs.close();
}
}
