//118
public class func{
	public void varcharAll(){
        PreparedStatement ps = getOrPrepareStatement(
          "SELECT VC10,VC100,VC1000 FROM T --DERBY-PROPERTIES index=T_VC_ALL");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            for (int col = 1; col <= 3; col++) {
                assertNotNull(rs.getString(col));
            }
        }
        rs.close();
}
}
