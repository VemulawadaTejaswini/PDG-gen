public class func{
public void setupTimeButtonText(View v){
        ((Button)v.findViewById(R.id.setTime)).setText(formatter.format(dateTimeForEntry.toDate()));
}
}
