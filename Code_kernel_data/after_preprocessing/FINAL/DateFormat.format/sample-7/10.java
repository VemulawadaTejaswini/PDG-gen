public class func{
public void getTimeByZoneAndFormat(Date date,TimeZone zone,String format){
        final DateFormat formatter = new SimpleDateFormat(format, LOCALE_US);
        formatter.setTimeZone(zone);
        return formatter.format(date);
}
}
