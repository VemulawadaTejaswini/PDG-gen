public class func{
public void getRecentBaseModelsCount(long groupId){
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.HOUR, -1);
    return MBThreadServiceUtil.getGroupThreadsCount(
      groupId, 0, calendar.getTime(), WorkflowConstants.STATUS_APPROVED);
}
}
