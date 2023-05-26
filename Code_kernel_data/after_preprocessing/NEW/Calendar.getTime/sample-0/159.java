//159
public class func{
public void getGTDate(Calendar cal){
    Calendar gtCal = (Calendar)cal.clone();
    gtCal.set(Calendar.MILLISECOND, 0);
    return gtCal.getTime();
}
}
