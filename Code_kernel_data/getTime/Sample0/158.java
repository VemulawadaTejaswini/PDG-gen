//157
public class func{
	public void testEncodingDecodingMs(){
        for (int i = 0; i < 1000; i++) {
            cal.set(Calendar.MILLISECOND, i);
            Date date = cal.getTime();
            String encoded = DateParser.formatW3CDateTimeMs(date);
            Date decoded = DateParser.parseW3CDateTime(encoded);
            assertEquals(date, decoded);
        }
}
}
