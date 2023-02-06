//132
public class func{
public void date(int year,int month,int day,int hour,int minute,int second){
        c.setTimeZone(TimeZone.getTimeZone("GMT"));
        c.set(year, month-1, day, hour, minute, second);
        return c.getTime();
}
}
