public class func{
public void getDefaultPreloadBegin(Date date){
        Calendar calendar = Calendar.getInstance(CalendarHelper.getTimeZoneOrDefault(this),
                CalendarHelper.getAsLocale(facesContext, this, getLocale()));
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE));
        return calendar.getTime();
}
}
