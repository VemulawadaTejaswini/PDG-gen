//15
public class func{
public void updateCaption(){
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
    String formattedDate = dateFormat.format(date);
    injectedTextView.setText(caption + " - " + formattedDate);
}
}
