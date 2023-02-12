public class func{
public void setEnrolmentBeginDay(Calendar enrolmentBeginDay){
        if (enrolmentBeginDay != null) {
            this.setEnrolmentBeginDayDate(enrolmentBeginDay.getTime());
        } else {
            this.setEnrolmentBeginDayDate(null);
        }
}
}
