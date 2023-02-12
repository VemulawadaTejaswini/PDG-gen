public class func{
public void format(Object value,Integer style,Locale locale,TimeZone timeZone){
        DateFormat dateFormat = DateFormat.getDateTimeInstance(style, style,
                locale);
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(value);
}
}
