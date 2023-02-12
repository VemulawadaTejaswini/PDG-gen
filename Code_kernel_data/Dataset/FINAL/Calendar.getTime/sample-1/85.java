public class func{
public void getQueryBuilder(){
    builder.setWhere(builder.where().ge(RedmineRecentIssue.MODIFIED, cal.getTime()));
}
}
