public class func{
public void reqDate(){
    Locale locale = Locale.getDefault();
    DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.LONG, locale);
    return dateFormatShort.format(date);
}
}
