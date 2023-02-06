//44
public class func{
public void getExpired(){
        Calendar today = Calendar.getInstance();
        today.set(Calendar.SECOND, 59);
        return (endDate != null) && (endDate.compareTo(today.getTime()) > 0);
}
}
