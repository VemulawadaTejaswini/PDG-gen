public class func{
public void format(boolean allDay,Date date){
    DateFormat format = allDay ? DateFormat.getDateInstance(DateFormat.MEDIUM) : DateFormat.getDateTimeInstance(
        DateFormat.MEDIUM, DateFormat.MEDIUM);
    return format.format(date);
}
}
