//3
public class func{
public void ShiftHour(final Date dateFrom,final Date dateTo){
                Calendar cal = Calendar.getInstance();
                cal.setTime(dateTo);
                cal.add(Calendar.DATE, 1);
                this.dateTo = new Date(cal.getTime().getTime());
}
}
