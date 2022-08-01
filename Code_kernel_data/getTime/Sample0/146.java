//145
public class func{
	public void getDefaultValueOfDefaultTime(FacesContext facesContext,AbstractCalendar calendarComponent){
        if (calendarComponent == null) {
            return null;
        }
        Calendar calendar = CalendarHelper.getCalendar(facesContext, calendarComponent);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
}
}
