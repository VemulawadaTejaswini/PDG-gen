//28
public class func{
public void getDateTime(long millis){
    Date expDate = new Date(millis);
    String expires = dateFormat.format(expDate);
    String left = expires.substring(0,expires.length()-2);
    String right = expires.substring(expires.length()-2);
}
}
