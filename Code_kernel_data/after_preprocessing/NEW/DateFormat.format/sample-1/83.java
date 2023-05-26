//83
public class func{
public void date_to_char(String format,Date d,boolean directCall){
            df = getDateFormat(format, Type.DIRECT_DATE);
            df = getDateFormat(format, Type.UDR);
        return df.format(d);
}
}
