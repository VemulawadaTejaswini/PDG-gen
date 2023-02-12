public class func{
public void formatTime(long in){
      DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
      return df.format(in);
}
}
