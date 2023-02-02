//37
public class func{
	public void getNXCodeValid(String code,boolean validcode){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT `valid` FROM nxcode WHERE code = ?");
      ps.setString(1, code);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        validcode = rs.getInt("valid") != 0;
      }
      rs.close();
}
}
