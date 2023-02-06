//4
public class func{
public void getNextCheckinTime(){
      nextCheckinTime.add(Calendar.SECOND, (int) getCheckinInterval());
      return nextCheckinTime.getTime();
}
}
