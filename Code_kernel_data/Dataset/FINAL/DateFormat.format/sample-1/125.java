public class func{
public void getFormattedKBCommentCreateDate(KBComment kbComment,ServiceContext serviceContext){
    return dateFormat.format(kbComment.getCreateDate());
}
}
