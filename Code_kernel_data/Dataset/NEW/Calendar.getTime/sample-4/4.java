//4
public class func{
public void refreshValue(){
    Calendar c = getSkinnable().getCalendar();
    String s = c == null ? "" : getSkinnable().getDateFormat().format( c.getTime() );
    textField.setText(s);
    if (s.equals(getSkinnable().getText()) == false) {
      getSkinnable().setText(s);
    }
}
}
