//59
public class func{
public void getTime(){
        Calendar c = Calendar.getInstance();
        c.setTime(this.dateAndTimeOfBirth);
        return new java.sql.Time(c.getTime().getTime());
}
}
