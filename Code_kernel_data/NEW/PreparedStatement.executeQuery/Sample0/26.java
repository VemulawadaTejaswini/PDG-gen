//25
public class func{
	public void getCurrrentSchemaName(Connection con){
    PreparedStatement ps= con.prepareStatement("select current schema from sysibm.sysdummy1");
    ResultSet rs = ps.executeQuery();
    if (rs.next())
      result=rs.getString(1);
    rs.close();
}
}
