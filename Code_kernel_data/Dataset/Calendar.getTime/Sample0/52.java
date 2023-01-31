//51
public class func{
	public void getDate(int year,int month,int day){
    Calendar date = Calendar.getInstance();
    date.set(Calendar.DAY_OF_MONTH, day);
    return date.getTime();
}
}
