//27
public class func{
public void TestSCH(){
      DateFormat s = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.SIMPLIFIED_CHINESE);
      return Test(s.format(now), getDayofWeek(now, Locale.SIMPLIFIED_CHINESE), "\"EEEE\" in " + Locale.SIMPLIFIED_CHINESE.toString());
}
}
