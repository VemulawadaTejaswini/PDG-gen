public class func{
public void formatTimeLong(Date time){
        DateFormat formatter = DateFormat.getTimeInstance(DateFormat.MEDIUM, JiveGlobals.getLocale());
        formatter.setTimeZone(JiveGlobals.getTimeZone());
        return formatter.format(time);
}
}
