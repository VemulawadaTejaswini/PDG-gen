//108
public class func{
	public void toString(String format){
        DateFormat formatter = getFormatter(format);
        Timestamp ts = getTempTimestamp(getTime());
        return formatter.format(ts);
}
}
