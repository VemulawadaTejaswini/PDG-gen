//6
public class func{
	public void buildDate(int month,int year){
        c.set(Calendar.DAY_OF_MONTH, random.nextInt(28)); // No sales on 29, 30 and 31 ;-)
        c.set(Calendar.MONTH, month - 1); // Some genius thought that the first month is 0
        c.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        c.set(Calendar.MINUTE, random.nextInt(60));
        return c.getTime();
}
}
