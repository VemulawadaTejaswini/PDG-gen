//9
public class func{
public void change_min(){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(this.min);
    calendar.add(Calendar.HOUR_OF_DAY, 1);
    this.min = calendar.getTime();
}
}
