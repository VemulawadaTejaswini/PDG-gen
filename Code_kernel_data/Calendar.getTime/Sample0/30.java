//29
public class func{
	public void getDate(int year,int month,int day){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
}
}
