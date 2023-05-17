public class func{
public void timestampToString(Date timestamp){
    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    String string = dateFormat.format(timestamp);
    string = string.replace("+0000", "Z");
}
}
