public class func{
public void setUp(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        tomorrow = calendar.getTime();
        dateRangeRandomizer = new DateRangeRandomizer(today, tomorrow);
}
}
