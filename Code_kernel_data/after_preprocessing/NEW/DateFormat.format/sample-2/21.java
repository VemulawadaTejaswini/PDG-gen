//21
public class func{
public void setLastUpdate(Date date){
        final DateFormat lastUpdateDateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
        setConfig(LAST_UPDATE, lastUpdateDateFormat.format(date));
}
}
