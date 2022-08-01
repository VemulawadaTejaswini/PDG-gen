//147
public class func{
	public void testReceiveBinary(){
        for (int i = 0; i < 10; i++)
        {
            ps.setInt(1, 42 + i);
            ResultSet rs = ps.executeQuery();
            assertEquals("One row should be returned", true, rs.next());
            assertEquals(42 + i, rs.getInt(1));
            rs.close();
        }
}
}
