public class func{
public void getDateDos(int time){
  Calendar cal = Calendar.getInstance();
  cal.set(Calendar.SECOND, (time & 0x1f) * 2);
  return cal.getTime();
}
}
