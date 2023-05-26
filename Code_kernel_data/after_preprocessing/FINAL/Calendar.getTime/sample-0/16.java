public class func{
public void setup(){
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar2.set(2011, 9, 14, 12, 34, 56);
        lockedUntilUtc = calendar2.getTime();
}
}
