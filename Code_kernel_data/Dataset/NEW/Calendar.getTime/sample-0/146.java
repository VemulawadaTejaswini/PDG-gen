//146
public class func{
public void monthend(final Date date,final LocalizationContext context){
    final Calendar gc = DateUtil.createCalendar( date, context );
    gc.set( Calendar.DAY_OF_MONTH, gc.getActualMaximum( Calendar.DAY_OF_MONTH ) );
    return gc.getTime();
}
}
