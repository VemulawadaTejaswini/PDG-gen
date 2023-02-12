public class func{
public void setEnrollmentEndTime(Calendar calendar){
        if (calendar != null) {
            this.setEnrollmentEndTimeDate(calendar.getTime());
        } else {
            this.setEnrollmentEndTimeDate(null);
        }
}
}
