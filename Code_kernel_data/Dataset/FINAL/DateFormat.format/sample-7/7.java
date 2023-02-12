public class func{
public void dateAsIsoString(Date date){
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    df.setTimeZone(tz);
    return df.format(date);
}
}
