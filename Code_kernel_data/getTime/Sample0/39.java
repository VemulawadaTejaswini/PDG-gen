//38
public class func{
	public void getDate(int year,int month,int day){
        Calendar cal = Calendar.getInstance();
        cal.set( Calendar.MILLISECOND, 0 );
        return cal.getTime();
}
}
