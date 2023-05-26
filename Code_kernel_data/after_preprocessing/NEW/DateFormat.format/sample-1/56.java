//56
public class func{
public void setupDateButtonText(View v){
        ((Button)v.findViewById(R.id.setDate)).setText(formatter.format(dateTimeForEntry.toDate()));
}
}
