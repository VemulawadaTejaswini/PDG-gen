//13
public class func{
public void dateSliderMouseDragged(java.awt.event.MouseEvent evt){
            DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ENGLISH);
            lblCurrentDate.setText(dateFormatter.format(pauseDate));
}
}
