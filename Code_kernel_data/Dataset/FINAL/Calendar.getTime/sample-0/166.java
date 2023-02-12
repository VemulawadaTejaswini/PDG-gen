public class func{
public void toDate(){
        calendar.set(getYYYY(), getMonth() - 1, getDayOfMonth(), 0, 0, 0);
        return calendar.getTime();
}
}
