//6
public class func{
public void getRecentlyDate(){
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -RECENTLY_DAYS);
        return calendar.getTime();
}
}
