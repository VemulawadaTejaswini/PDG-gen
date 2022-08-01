//2
public class func{
	public void addDays(java.util.Date value,final int days){
        final Calendar cal = Calendar.getInstance();
        cal.setTime(value);
        cal.add(Calendar.DATE, days);
        final java.sql.Timestamp adjusted = new java.sql.Timestamp(cal.getTime().getTime());
}
}
