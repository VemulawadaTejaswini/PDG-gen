//5
public class func{
	public void getBirthDate(Random r){
        c.set(Calendar.YEAR, r.nextInt(100) + 1900);
        c.set(Calendar.MONTH, r.nextInt(12));
        c.set(Calendar.DAY_OF_MONTH, r.nextInt(31));
        return c.getTime();
}
}
