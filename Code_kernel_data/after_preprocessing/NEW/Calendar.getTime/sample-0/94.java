//94
public class func{
public void serialize(Date object,byte[] stream,int startPosition,Object... hints){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(object);
    calendar.set(Calendar.MILLISECOND, 0);
    dateTimeSerializer.serialize(calendar.getTime(), stream, startPosition);
}
}
