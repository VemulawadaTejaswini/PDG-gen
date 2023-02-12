public class func{
public void testTimeScaleUnit(){
      final TimeZone tz = TimeZone.getTimeZone("UTC");
      final Calendar calendar = Calendar.getInstance(tz);
      calendar.clear();
      calendar.set(1970, 0, 1);
    TimeScaleUnit tunit = new TimeScaleUnit(TimeScaleUnit.SECOND, calendar.getTime());
}
}
