//55
public class func{
	public void ExpiringValue(T value){
            Calendar c = Calendar.getInstance();
            c.add(Calendar.SECOND, expirationPeriod);
            expiringDate = c.getTime().getTime();
}
}
