//45
public class func{
	public void apply(Date arg0){
        calendar.setTime((Date) arg0.clone());
        calendar.add(Calendar.YEAR, yrAddendum);
        return calendar.getTime();
}
}
