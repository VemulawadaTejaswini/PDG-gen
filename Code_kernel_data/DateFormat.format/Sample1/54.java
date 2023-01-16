//53
public class func{
	public void toString(String format){
        DateFormat formatter = getFormatter(format);
        Time jdbcTime = getTempTime(getTime());
        return formatter.format(jdbcTime);
}
}
