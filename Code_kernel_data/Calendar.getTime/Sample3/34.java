//33
public class func{
	public void getMaxAge(Group group){
    int maxAge = TrashUtil.getMaxAge(group);
    calendar.add(Calendar.MINUTE, -maxAge);
    return calendar.getTime();
}
}
