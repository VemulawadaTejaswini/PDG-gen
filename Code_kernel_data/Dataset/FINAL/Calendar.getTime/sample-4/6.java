public class func{
public void format(Calendar calendar){
        if (calendar == null) {
            return formatter.format(new Date(0L));
        } else {
            return formatter.format(calendar.getTime());
        }
}
}
