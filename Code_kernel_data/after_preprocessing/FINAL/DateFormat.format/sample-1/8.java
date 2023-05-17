public class func{
public void getFormattedModificationDate(Context c){
    Date date = new Date(mFile.lastModified());
    return dateFormat.format(date) + " " + timeFormat.format(date);    
}
}
