//16
public class func{
	public void getLastUpdate(){
                Calendar calBegin = Calendar.getInstance();
                calBegin.setTime(now);
                calBegin.add(Calendar.MONTH, -4);
                return calBegin.getTime();
}
}
