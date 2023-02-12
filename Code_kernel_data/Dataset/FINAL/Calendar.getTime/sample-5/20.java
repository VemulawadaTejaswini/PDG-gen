public class func{
public void print(Calendar c){
        String timezoneStr = timezone.format(c.getTime());
        timezoneStr = timezoneStr.substring(0, timezoneStr.length()-2) + ":" + timezoneStr.substring(timezoneStr.length()-2);
}
}
