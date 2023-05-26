public class func{
public void getAmPmTextFor(Integer aHour){
        Calendar someDay = new GregorianCalendar();
        someDay.set(Calendar.HOUR_OF_DAY, aHour);
        return format.format(someDay.getTime());
}
}
