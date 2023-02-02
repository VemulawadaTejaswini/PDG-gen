//59
public class func{
	public void testConversion(){
    Calendar calendar = Calendar.getInstance();
    calendar.set(2009, 6, 3, 12, 20, 10);
    DateContainer result = mapper.map(calendar.getTime(), DateContainer.class);
    assertNotNull(result);
    assertEquals("2009-07-03 12:20:10", result.getDate());
    assertEquals("2009-07-03 12:20:10", result.getSet().iterator().next());
}
}
