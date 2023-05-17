public class func{
public void change_max(){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this.max);
    calendar.add(Calendar.HOUR_OF_DAY, 1);
    this.max = calendar.getTime();
}
}
