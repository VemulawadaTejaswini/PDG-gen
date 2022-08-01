//29
public class func{
	public void addDays(Date date,int days){
  final Calendar c = Calendar.getInstance();
  c.setTime(date);
  c.add(unit, days);
  return c.getTime();
}
}
