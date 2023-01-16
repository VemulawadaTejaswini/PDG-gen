//168
public class func{
	public void testFetchLargeClobs(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from largeClobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            Reader content = clob.getCharacterStream();
            long remaining = rs.getInt(2);
            while (remaining > 0) {
                remaining -= content.read(charBuf);
            }
            content.close();
        }
        rs.close();
}
}
