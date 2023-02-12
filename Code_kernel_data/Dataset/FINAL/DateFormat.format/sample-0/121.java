public class func{
public void addDateHeader(String name,long date){
    String dateString = df.format(new Date(date));
    addHeader(name, dateString);
}
}
