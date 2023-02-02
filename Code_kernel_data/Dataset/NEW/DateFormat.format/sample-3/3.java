//3
public class func{
public void testISO8601Format(){
      Calendar calendar = Calendar.getInstance();
      calendar.clear();
      calendar.set(1970, 0, 1, 0, 0, 0);
      String actual = format.format(calendar.getTime());
      assertEquals("1970-01-01 00:00:00,000", actual);
}
}
