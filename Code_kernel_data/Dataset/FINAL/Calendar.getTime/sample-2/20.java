public class func{
public void addDate(Date source,int day){
    Calendar cal = Calendar.getInstance();
    cal.setTime(source);
    cal.add(Calendar.DAY_OF_MONTH, day);
    return cal.getTime();
}
}
