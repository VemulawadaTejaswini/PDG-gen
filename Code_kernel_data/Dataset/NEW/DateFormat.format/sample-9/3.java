//3
public class func{
public void formatShortTime(Context context,Date time){
        TimeZone tz = PrefUtils.getDisplayTimeZone(context);
        if (tz != null) {
            format.setTimeZone(tz);
        }
        return format.format(time);
}
}
