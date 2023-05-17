public class func{
public void testFetchSmallClobsInaccurateLength(){
        PreparedStatement ps = prepareStatement(
                "select dClob, length from smallClobs");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Clob clob = rs.getClob(1);
            int unusedLength = rs.getInt(2);
            String content = clob.getSubString(1, 100);
        }
        rs.close();
}
}
