//56
public class func{
public void getDate(){
            Calendar c = Calendar.getInstance();
            c.setTime(this.dateAndTimeOfBirth);
            return new java.sql.Date(c.getTime().getTime());
}
}
