public class func{
public void onDateSet(CalendarDatePickerDialog calendarDatePickerDialog,int year,int monthOfYear,int dayOfMonth){
        Calendar cal = new GregorianCalendar(year, monthOfYear, dayOfMonth);
        mDateTextView.setText(DATE_FORMATTER.format(cal.getTime()));
        mDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);
}
}
