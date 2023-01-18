//210
public class func{
	public void testPrepareSetDate(){
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setDate(1, dtValue);
      ResultSet res = ps.executeQuery();
      assertTrue(res.next());
      assertEquals("2013-01-01", res.getString(20));
      ps.close();
}
}
