//209
public class func{
	public void testBinaryFetch(){
        PreparedStatement stmt = con.prepareStatement("declare test_cursor binary cursor for select * from test_fetch");
        stmt.execute();
        stmt = con.prepareStatement("fetch forward from test_cursor");
        ResultSet rs = stmt.executeQuery();
        while (rs.next())
        {
            //there should only be one row returned
            byte[] dataBytes = rs.getBytes(2);
            assertEquals("binary data got munged", DATA_STRING, new String(dataBytes, "UTF8"));
        }
}
}
