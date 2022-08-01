//206
public class func{
	public void reserveSlotsInBulkUsingBindsAndAssertValue(int expectedValue,long numSlotToAllocate){
        PreparedStatement ps = conn.prepareStatement("SELECT NEXT ? VALUES FOR bulkalloc.alpha FROM SYSTEM.\"SEQUENCE\"");
        ps.setLong(1, numSlotToAllocate);
        ResultSet rs = ps.executeQuery();
        assertTrue(rs.next());
        int retValue = rs.getInt(1);
        assertEquals(expectedValue, retValue);
}
}
