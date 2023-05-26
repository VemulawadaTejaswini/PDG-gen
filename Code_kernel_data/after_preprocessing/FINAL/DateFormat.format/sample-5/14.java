public class func{
public void convertDateTimeToUniversalDateTimeString(Date dt){
    utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
    return utcFormatter.format(dt);
}
}
