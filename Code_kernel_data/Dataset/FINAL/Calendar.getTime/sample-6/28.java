public class func{
public void DateRenderer(){
      Calendar cal = Calendar.getInstance();
      cal.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
      cal.add(Calendar.YEAR, -1);
      cutoff = cal.getTime();
}
}
