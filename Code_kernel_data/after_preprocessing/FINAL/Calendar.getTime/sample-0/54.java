public class func{
public void getDate(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
}
}
