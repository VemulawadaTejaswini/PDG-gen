//22
public class func{
public void getRecentChanges(long groupId,long nodeId,int start,int end){
    Calendar cal = CalendarFactoryUtil.getCalendar();
    cal.add(Calendar.WEEK_OF_YEAR, -1);
    return wikiPageFinder.findByCreateDate(
      groupId, nodeId, cal.getTime(), false, start, end);
}
}
