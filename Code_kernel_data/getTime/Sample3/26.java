//25
public class func{
	public void getLiferayDate(Date jiraDate){
    cal.add(Calendar.MILLISECOND, _getUTCOffset() * -1);
    return cal.getTime();
}
}
