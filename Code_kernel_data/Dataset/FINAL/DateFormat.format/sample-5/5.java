public class func{
public void toSimpleDateTime(Date date){
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        return df.format(date);
}
}
