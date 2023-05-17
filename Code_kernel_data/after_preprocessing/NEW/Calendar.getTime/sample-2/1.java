//1
public class func{
public void getLatency(int seconds){
        Calendar before = Calendar.getInstance();
        before.setTime(now);
        before.add(Calendar.SECOND, -seconds);
        return getLatency(before.getTime(), now);
}
}
