//0
public class func{
public void updateNextRotationTime(){
    Calendar cal = Calendar.getInstance();
    cal.add(time_scale, time_value);
    next_rotation = cal.getTime().getTime();
}
}
