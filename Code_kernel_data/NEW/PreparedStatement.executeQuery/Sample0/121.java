//120
public class func{
	public void testModifySmallClobs(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from smallClobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            int length = rs.getInt(2);
            clob.setString(length, "X");
            String content = clob.getSubString(1, 100);
        }
        rs.close();
}
}
