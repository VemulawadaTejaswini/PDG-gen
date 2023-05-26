//7
public class func{
public void quickFormatCalendarAsDate(Calendar value){
    return value == null ? "null" : lSimpleDateFormat.format(value.getTime());
}
}
