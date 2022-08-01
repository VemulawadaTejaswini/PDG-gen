//41
public class func{
	public void previous(){
    Calendar yesterday = getInstance();
    yesterday.setTime(this);
    yesterday.add(DAY_OF_MONTH, -1);
    return new Date(yesterday.getTime());
}
}
