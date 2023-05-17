//110
public class func{
public void time(int hour,int minute,int second){
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.SECOND, second);
    return calendar.getTime();
}
}
