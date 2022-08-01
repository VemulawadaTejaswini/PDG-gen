//101
public class func{
	public void varchar10(){
        PreparedStatement ps = getOrPrepareStatement(
                "SELECT VC10 FROM T --DERBY-PROPERTIES index=T_VC10");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            assertNotNull(rs.getString(1));
        }
        rs.close();
}
}
