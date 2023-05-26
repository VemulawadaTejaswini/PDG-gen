public class func{
public void setEnrollmentEndDay(Calendar calendar){
        if (calendar != null) {
            this.setEnrollmentEndDayDate(calendar.getTime());
        } else {
            this.setEnrollmentEndDayDate(null);
        }
}
}
