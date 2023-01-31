//172
public class func{
	public void decimal10columns(){
        PreparedStatement ps = getOrPrepareStatement(
                "SELECT DEC1,DEC2,DEC3,DEC4,DEC5,DEC6,DEC7,DEC8,DEC9,DEC10 " +
                "FROM T --DERBY-PROPERTIES index=T_DEC_ALL");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            for (int col = 1; col <= 10; col++) {
                assertNotNull(rs.getBigDecimal(col));
            }
        }
        rs.close();
}
}
