//18
public class func{
	public void getRecentChangesCount(long groupId,long nodeId){
    Calendar cal = CalendarFactoryUtil.getCalendar();
    cal.add(Calendar.WEEK_OF_YEAR, -1);
    return wikiPageFinder.countByCreateDate(
      groupId, nodeId, cal.getTime(), false);
}
}
