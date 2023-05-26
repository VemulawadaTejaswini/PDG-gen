public class func{
public void convertToString(final D value,final Locale locale){
    final DateFormat dateFormat = getDateFormat(locale);
    if (dateFormat != null)
    {
      return dateFormat.format(value);
    }
    return value.toString();
}
}
