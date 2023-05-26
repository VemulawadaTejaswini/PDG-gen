//19
public class func{
public void getThroughput(int seconds){
        Calendar before = Calendar.getInstance();
        before.setTime(now);
        before.add(Calendar.SECOND, -seconds);
        return getThroughput(before.getTime(), now);
}
}
