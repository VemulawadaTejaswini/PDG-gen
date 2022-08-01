//51
public class func{
	public void saveIssue(SQLiteDatabase db,Issue issue){
        values.put("dateUpdated", dateFormat.format(issue.getDateUpdated()));
        values.put("isCrashReport", Boolean.TRUE);
        db.insert(IssuePersisterDatabase.ISSUES_TABLE_NAME, null, values);
}
}
