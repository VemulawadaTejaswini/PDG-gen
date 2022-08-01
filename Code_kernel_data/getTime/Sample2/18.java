//17
public class func{
	public void addTime(Date time,int amount,int field){
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(time);
      calendar.add(field, amount);
      return calendar.getTime();
}
}
