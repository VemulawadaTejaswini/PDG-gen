public class func{
public void next(){
    Calendar tomorrow = getInstance();
    tomorrow.setTime(this);
    tomorrow.add(DAY_OF_MONTH, 1);
    return new Date(tomorrow.getTime());
}
}
