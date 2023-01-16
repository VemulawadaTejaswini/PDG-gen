//4
public class func{
	public void testChangeType(Connection conn){
        PreparedStatement prep = conn.prepareStatement(
                "select (? || ? || ?) from dual");
        prep.setString(3, "c");
        prep.executeQuery();
        prep.setInt(1, 1);
        prep.setString(2, "ab");
        prep.setInt(3, 45);
        prep.executeQuery();
}
}
