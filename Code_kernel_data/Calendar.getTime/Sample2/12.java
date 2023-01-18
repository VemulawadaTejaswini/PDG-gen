//11
public class func{
	public void addSecond(Date source,int s){
    Calendar cal = Calendar.getInstance();
    cal.setTime(source);
    cal.add(Calendar.SECOND, s);
    return cal.getTime();
}
}
