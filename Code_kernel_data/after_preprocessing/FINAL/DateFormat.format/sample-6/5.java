public class func{
public void onNegativeButtonClicked(int resultCode,Date date){
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        Toast.makeText(this, text + "Cancelled " + dateFormat.format(date), Toast.LENGTH_SHORT).show();
}
}
