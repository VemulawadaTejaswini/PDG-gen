public class func{
public void reqDate(){
    Locale locale = Locale.getDefault(); // to get the language of the system
    DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.LONG, locale);
    return dateFormatShort.format(date);
}
}
