//19
public class func{
public void setEnrollmentBeginTime(Calendar calendar){
        if (calendar != null) {
            this.setEnrollmentBeginTimeDate(calendar.getTime());
        } else {
            this.setEnrollmentBeginTimeDate(null);
        }
}
}
