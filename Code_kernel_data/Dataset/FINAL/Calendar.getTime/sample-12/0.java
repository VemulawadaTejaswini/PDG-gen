public class func{
public void onDateChanged(DatePicker view,int year,int month,int day){
    Calendar selected = new GregorianCalendar(year, month, day);
    this.changedValueCanBeNull = formatter().format(selected.getTime());
}
}
