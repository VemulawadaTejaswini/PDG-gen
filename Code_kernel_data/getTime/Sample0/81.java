//80
public class func{
	public void onDateSet(DatePickerDialog dialog,int year,int monthOfYear,int dayOfMonth){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        Toast.makeText(getSupportActivity(), "Set date: " + DATE_FORMAT.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
}
}
