//48
public class func{
public void timestamp_to_char(String format,Timestamp ts,boolean directCall){
            df = getDateFormat(format, Type.DIRECT_TIMESTAMP);
            df = getDateFormat(format, Type.UDR);
        return df.format(ts);
}
}
