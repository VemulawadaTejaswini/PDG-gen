public class func{
public void getGMTString(Date date){
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df.format(date);
}
}
