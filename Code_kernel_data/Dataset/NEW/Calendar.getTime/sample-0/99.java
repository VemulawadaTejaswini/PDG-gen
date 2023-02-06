//99
public class func{
public void getNextLaunchDate(){
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR));
        calendar.set(Calendar.SECOND, 0);
        return new Date(calendar.getTime().getTime() + MILLISEC_IN_DAY);
}
}
