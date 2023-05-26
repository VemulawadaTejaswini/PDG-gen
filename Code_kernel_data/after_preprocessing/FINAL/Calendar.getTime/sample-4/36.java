public class func{
public void setBeginning(Calendar calendar){
        if (calendar != null) {
            this.setBeginningDate(calendar.getTime());
        } else {
            this.setBeginningDate(null);
        }
}
}
