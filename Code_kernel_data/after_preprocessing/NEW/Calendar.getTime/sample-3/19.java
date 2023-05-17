//19
public class func{
public void getHTTPTime(int days){
            calendar.add(Calendar.DAY_OF_MONTH, days);
            return dateFormat.format(calendar.getTime());
}
}
