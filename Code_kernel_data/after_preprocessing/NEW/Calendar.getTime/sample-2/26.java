//26
public class func{
public void getUnbanDate(MBBan ban,int expireInterval){
    Calendar cal = Calendar.getInstance();
    cal.setTime(banDate);
    cal.add(Calendar.DATE, expireInterval);
    return cal.getTime();
}
}
