public class func{
public void toString(String format){
        DateFormat formatter = getFormatter(format);
        Date jdbcDate = getTempDate(getTime());
        return formatter.format(jdbcDate);
}
}
