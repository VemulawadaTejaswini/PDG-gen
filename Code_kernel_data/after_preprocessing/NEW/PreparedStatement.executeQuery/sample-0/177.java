//177
public class func{
public void testLargeClobTruncateLengthMinusOne(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from largeClobs where id = 8");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            int length = rs.getInt(2);
            clob.truncate(length -1);
        }
}
}
