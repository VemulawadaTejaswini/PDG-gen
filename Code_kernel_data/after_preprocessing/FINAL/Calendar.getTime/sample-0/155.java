public class func{
public void getMonthYearString(){
    cal.set(mdh.getYear(), mdh.getMonth(), 1);
    return sdfDate.format(cal.getTime());
}
}
