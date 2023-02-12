public class func{
public void getPortletPreferencesResultSet(String portletId,int ownerType){
    Connection con = DataAccess.getUpgradeOptimizedConnection();
    PreparedStatement ps = con.prepareStatement(
      "select portletPreferencesId, ownerId, ownerType, plid, " +
        "portletId, preferences from PortletPreferences where " +
          "ownerType = ? and portletId = ?");
    ps.setInt(1, ownerType);
    ps.setString(2, portletId);
    return ps.executeQuery();
}
}
