public class func{
public void setEnd(Calendar calendar){
        if (calendar != null) {
            this.setEndDate(calendar.getTime());
        } else {
            this.setEndDate(null);
        }
}
}
