//28
public class func{
public void setEnrolmentEndDay(Calendar enrolmentEndDay){
        if (enrolmentEndDay != null) {
            this.setEnrolmentEndDayDate(enrolmentEndDay.getTime());
        } else {
            this.setEnrolmentEndDayDate(null);
        }
}
}
