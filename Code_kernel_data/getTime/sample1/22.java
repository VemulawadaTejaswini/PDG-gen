//21
public class func{
	public void init(){
    calendar.setTime(new Date());
    calendar.set(0, 0, 0, 10, 10);
    this.min = calendar.getTime();
    calendar.set(0, 0, 0, 12, 10);
    this.max = calendar.getTime();
}
}
