public class func{
public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth){
            Calendar selected = Calendar.getInstance();
            selected.set(year, monthOfYear, dayOfMonth);
            text.setText(TypeConverter.getDateString(selected.getTime()));
}
}
