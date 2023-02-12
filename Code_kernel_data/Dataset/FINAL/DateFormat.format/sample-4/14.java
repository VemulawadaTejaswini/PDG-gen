public class func{
public void setPreference(String key,Date value){
        DateFormat dateFormat = DateFormat.getDateTimeInstance( DateFormat.LONG, DateFormat.LONG, Locale.ENGLISH );
        setPreference( key, dateFormat.format( value ) );
}
}
