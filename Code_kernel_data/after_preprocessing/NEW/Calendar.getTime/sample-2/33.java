//33
public class func{
public void increaseTime(Clock clock){
    c.setTime(clock.getCurrentTime());
    c.add(Calendar.SECOND, 1);
    clock.setCurrentTime(c.getTime());
}
}
