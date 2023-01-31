//147
public class func{
	public void createTime(Session session,int hour,int minute,int second){
    Calendar c1 = GregorianCalendar.getInstance();
    c1.set(Calendar.SECOND, second);
    Date d = c1.getTime();
}
}
