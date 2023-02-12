public class func{
public void expand(Date d){
            Calendar c = new GregorianCalendar(UTC_TZ);
            c.setTime(d);
            c.add(Calendar.MILLISECOND, -1);
            return new DateRange(d, c.getTime());
}
}
