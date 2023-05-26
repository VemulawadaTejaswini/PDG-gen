//134
public class func{
public void evaluate(int srcRowIndex,int srcColumnIndex){
    Calendar now = new GregorianCalendar();
    now.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE),0,0,0);
    now.set(Calendar.MILLISECOND, 0);
    return new NumberEval(DateUtil.getExcelDate(now.getTime()));
}
}
