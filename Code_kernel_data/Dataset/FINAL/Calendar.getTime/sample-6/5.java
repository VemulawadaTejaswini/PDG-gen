public class func{
public void getFormatPreMonthAsYYYYMM(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,-1);
        return yyyymm.format(cal.getTime());
}
}
