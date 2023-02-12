public class func{
public void toDateString(){
    java.util.Date today = Calendar.getInstance().getTime();
    return df.format(today);
}
}
