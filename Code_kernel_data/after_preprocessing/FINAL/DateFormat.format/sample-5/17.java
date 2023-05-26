public class func{
public void setDate(Date date){
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        setDate(df.format(date));
}
}
