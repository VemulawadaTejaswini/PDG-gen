public class func{
public void getMysqlTimeStampForWeek(int week){
    df.setTimeZone(TimeZone.getTimeZone("GMT"));
    String mysql_time = df.format(time);  
}
}
