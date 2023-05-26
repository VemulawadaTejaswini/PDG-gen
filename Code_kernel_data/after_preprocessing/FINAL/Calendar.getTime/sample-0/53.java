public class func{
public void TimestampSetter(){
    calendar = Calendar.getInstance();
    calendar.set(Calendar.MILLISECOND, 0);
    timestamp = new SimpleTimestampContainer(calendar.getTime());
}
}
