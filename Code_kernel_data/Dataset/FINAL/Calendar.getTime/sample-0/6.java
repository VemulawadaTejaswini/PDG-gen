public class func{
public void buildDate(int month,int year){
        c.set(Calendar.DAY_OF_MONTH, random.nextInt(28));
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.HOUR_OF_DAY, random.nextInt(24));
        c.set(Calendar.MINUTE, random.nextInt(60));
        return c.getTime();
}
}
