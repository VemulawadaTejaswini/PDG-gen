public class func{
public void buildGrid(int position,Calendar startday,Calendar endday){
    tv.setText("muahah " + Integer.toString(position) + " ; "
        + dateFormat.format(startday.getTime()) + " - "
        + dateFormat.format(endday.getTime()));
}
}
