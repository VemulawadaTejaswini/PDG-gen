public class func{
public void format(DateFormat format,Calendar calendar){
    tmpFormat.setTimeZone(calendar.getTimeZone());
    return tmpFormat.format(calendar.getTime());
}
}
