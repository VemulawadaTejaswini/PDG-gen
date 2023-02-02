//139
public class func{
	public void readBytesJDBC(String key){
    Connection conn = getConnection();
    PreparedStatement ps = conn
        .prepareStatement("select value from hs4jtest where id = ?");
      ps.setString(1, key);
      ResultSet rs = ps.executeQuery();
      assertTrue(rs.next());
      byte[] bytes = rs.getBytes(1);
}
}
