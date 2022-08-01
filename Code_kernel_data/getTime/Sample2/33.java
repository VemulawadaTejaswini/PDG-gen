//32
public class func{
	public void addDays(final Date time,final int days){
    final Calendar c = new GregorianCalendar();
    c.setTime(time);
    c.add(Calendar.DAY_OF_YEAR, days);
    return c.getTime();
}
}
