//34
public class func{
public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth){
                        Calendar c = Calendar.getInstance(Locale.getDefault());
                        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                                .format(c.getTime()));
}
}
