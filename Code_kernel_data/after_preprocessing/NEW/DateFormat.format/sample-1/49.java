//49
public class func{
public void time_to_char(String format,Time t,boolean directCall){
            df = getDateFormat(format, Type.DIRECT_TIME);
            df = getDateFormat(format, Type.UDR);
        return df.format(t);
}
}
