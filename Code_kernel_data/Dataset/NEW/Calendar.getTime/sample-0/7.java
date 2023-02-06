//7
public class func{
public void getNextLaunchDate(){
    Calendar calendar = Calendar.getInstance(Locale.US);
    calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR));
    calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY));
    calendar.set(Calendar.SECOND, 0);
    return new Date(calendar.getTime().getTime() + MILLISEC_IN_HOUR);
}
}
