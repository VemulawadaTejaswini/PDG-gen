//101
public class func{
	public void createDate(int day,int month,int year){
    Calendar d = Calendar.getInstance();
    d.clear();
    d.set(Calendar.DATE, day);
    return d.getTime();
}
}
