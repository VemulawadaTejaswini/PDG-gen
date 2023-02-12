public class func{
public void formatDate(DateFormat dateFormat,DateTimeZone tz,long time){
            dateFormat.setTimeZone(convertToJavaTimeZone(tz, time));
            return dateFormat.format(new Date(time));
}
}
