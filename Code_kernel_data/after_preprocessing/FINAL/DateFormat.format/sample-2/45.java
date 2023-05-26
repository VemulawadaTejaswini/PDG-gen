public class func{
public void setTime(Date time){
        final DateFormat timeDateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
        return setConfig(TIME, timeDateFormat.format(time));
}
}
