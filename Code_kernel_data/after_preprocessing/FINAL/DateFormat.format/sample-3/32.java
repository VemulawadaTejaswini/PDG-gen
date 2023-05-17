public class func{
public void setDate(final Calendar cal){
    mTxtDate.setText(dateFormat.format(cal.getTime()));
    mTxtDate.setError(null);
}
}
