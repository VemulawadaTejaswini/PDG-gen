//64
public class func{
	public void toString(Object o,String formatString,Locale locale){
        Integer styleI = formatToInt.get(formatString);
        if ( styleI==null ) f = new SimpleDateFormat(formatString, locale);
        else {
            int style = styleI.intValue();
            if ( formatString.startsWith("date:") ) f = DateFormat.getDateInstance(style, locale);
            else if ( formatString.startsWith("time:") ) f = DateFormat.getTimeInstance(style, locale);
            else f = DateFormat.getDateTimeInstance(style, style, locale);
        }
        return f.format(d);
}
}
