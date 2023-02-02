//13
public class func{
public void millisecondsToDatestampAndTimestamp(long ms){
    Date d = new Date(ms);
    return new String[] {dateFormat.format(d), timeFormat.format(d)};
}
}
