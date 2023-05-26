public class func{
public void createDate(int year,int month,int day,int hour,int minute,int second){
            Calendar c = Calendar.getInstance();
            c.clear();
            c.set(Calendar.SECOND, second);
            return c.getTime();
}
}
