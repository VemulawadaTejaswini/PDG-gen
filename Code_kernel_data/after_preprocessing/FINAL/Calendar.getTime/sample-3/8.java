public class func{
public void add(Date d){
    cal.add( Calendar.SECOND, (int) getValueInSeconds());
    return cal.getTime();
}
}
