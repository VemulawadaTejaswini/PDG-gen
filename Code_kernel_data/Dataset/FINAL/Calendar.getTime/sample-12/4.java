public class func{
public void onTimeSet(RadialTimePickerDialog radialTimePickerDialog,int hourOfDay,int minute){
        Calendar cal = new GregorianCalendar(0, 0, 0, hourOfDay, minute);
        mTimeTextView.setText(TIME_FORMATTER.format(cal.getTime()));
        mTime.set(Calendar.MINUTE, minute);
}
}
