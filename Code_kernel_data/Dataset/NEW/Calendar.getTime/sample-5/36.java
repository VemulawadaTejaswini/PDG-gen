//36
public class func{
public void getDateTimeStr(int p_delay_min){
      Date l_time = cal.getTime();
      l_time.setMinutes(l_time.getMinutes() + p_delay_min);
      return sdf.format(l_time);
}
}
