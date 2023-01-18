//102
public class func{
	public void MapleFamily(int cid){
      PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT familyid FROM family_character WHERE cid = ?");
      ps.setInt(1, cid);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        MapleFamily.id = rs.getInt("familyid");
      }
      ps.close();
}
}
