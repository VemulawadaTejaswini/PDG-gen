public class func{
public void getDayStart(java.sql.Timestamp stamp,int daysLater){
    tempCal.setTime(new java.util.Date(stamp.getTime()));
    tempCal.set(tempCal.get(Calendar.YEAR), tempCal.get(Calendar.MONTH), tempCal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
    tempCal.add(Calendar.DAY_OF_MONTH, daysLater);
    return new java.sql.Timestamp(tempCal.getTime().getTime());
}
}
