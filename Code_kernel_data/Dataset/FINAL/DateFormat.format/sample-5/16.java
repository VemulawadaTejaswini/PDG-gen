public class func{
public void toGmtTimestampString(Timestamp timestamp){
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df.format(timestamp);
}
}
