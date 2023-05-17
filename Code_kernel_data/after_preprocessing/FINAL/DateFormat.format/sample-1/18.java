public class func{
public void setDateInContext(){
    Date currentDate = Calendar.getInstance().getTime();
    String date = dateFormat.format(currentDate) + " " + timeFormat.format(currentDate);
    setPropertyForKey(date, "Date");
}
}
