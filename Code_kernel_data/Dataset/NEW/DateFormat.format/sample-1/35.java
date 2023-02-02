//35
public class func{
public void saveComment(SQLiteDatabase db,String issueID,Comment comment){
        values.put("date", dateFormat.format(comment.getDate()));
        values.put("systemUser", comment.isSystemUser());
        db.insert(IssuePersisterDatabase.COMMENTS_TABLE_NAME, null, values);
}
}
