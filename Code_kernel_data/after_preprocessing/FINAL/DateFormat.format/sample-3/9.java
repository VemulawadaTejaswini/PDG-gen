public class func{
public void setTimeStamp(String timeStamp){
            Calendar cal = Calendar.getInstance();
            this.timeStamp = dateFormat.format(cal.getTime());
}
}
