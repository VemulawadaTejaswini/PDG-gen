public class func{
public void addToFields(int day,int month,int yr){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, yr);
        return calendar.getTime();
}
}
