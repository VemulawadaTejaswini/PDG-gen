public class func{
public void utcIsoString(Date date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        df.setTimeZone(UTC);
        return df.format(date) + "Z";
}
}
