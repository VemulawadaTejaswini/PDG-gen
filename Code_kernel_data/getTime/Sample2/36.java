//35
public class func{
	public void getStart(){
      cal.setTime(new ThisQuarter().getStart());
      cal.add(Calendar.MONTH,-3);
      return cal.getTime();
}
}
