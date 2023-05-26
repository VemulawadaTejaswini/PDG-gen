//20
public class func{
public void setEnrollmentBeginDay(Calendar calendar){
        if (calendar != null) {
            this.setEnrollmentBeginDayDate(calendar.getTime());
        } else {
            this.setEnrollmentBeginDayDate(null);
        }
}
}
