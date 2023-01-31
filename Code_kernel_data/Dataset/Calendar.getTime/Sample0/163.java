//162
public class func{
	public void createDate(int day,int month,int year){
        Calendar calendar = getInstance();
        calendar.set(MILLISECOND, 0);
        return calendar.getTime();
}
}
